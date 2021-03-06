package com.ijinshan.sjk.dao.market;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.ijinshan.sjk.po.Market;

/**
 * 91市场, 文件访问形式
 * @author Linzuxiong
 *
 */
@Repository
public class AccessM91DaoImpl extends AccessAppChinaDaoImpl {
    private static final Logger logger = LoggerFactory.getLogger(AccessM91DaoImpl.class);

    @Override
    public String getFullUrl(Market market) {
        if (market == null) {
            return null;
        }
        // http://apk.91.com/data/ijinshan_all_{day}.csv
        DateTime dest = new DateTime();
        String date = new java.text.SimpleDateFormat("yyyyMMdd").format(dest.toDate());
        String fullApiUrl = market.getFullUrl();
        StringBuilder url = new StringBuilder(fullApiUrl.length());
        url.append(fullApiUrl);
        if (!fullApiUrl.endsWith("/")) {
            url.append("/");
        }
        url.append("ijinshan_all_");
        url.append(date);
        url.append(".csv.gz");
        url.append("?t=");
        url.append(System.currentTimeMillis());
        return url.toString();
    }

    @Override
    public String getIncrementUrl(Market market) {
        if (market == null) {
            return null;
        }
        // http://apk.91.com/data/ijinshan_on_{day}_{hour}.csv
        DateTime dt = new DateTime(market.getIncrementLastTime());
        dt = dt.plusHours(1);
        String date = new java.text.SimpleDateFormat("yyyyMMdd_H").format(dt.toDate());
        String incrementApiUrl = market.getIncrementUrl();
        StringBuilder url = new StringBuilder(incrementApiUrl.length());
        url.append(incrementApiUrl);
        if (!incrementApiUrl.endsWith("/")) {
            url.append("/");
        }
        url.append("ijinshan_on_");
        url.append(date);
        url.append(".csv.gz");
        url.append("?t=");
        url.append(System.currentTimeMillis());
        return url.toString();
    }

    public static Logger getLogger() {
        return logger;
    }

}
