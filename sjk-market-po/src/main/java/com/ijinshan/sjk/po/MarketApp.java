package com.ijinshan.sjk.po;

// Generated 2013-4-4 15:44:58 by Hibernate Tools 3.4.0.CR1
import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

import com.ijinshan.sjk.po.marketmerge.ComparableBaseApp;

/**
 * MarketApp generated by hbm2java
 */
@Entity
@Table(name = "MarketApp", catalog = "AndroidMarket")
public class MarketApp extends ComparableBaseApp implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private String[] imageUrls = null;
    private Integer id;
    private String version;
    private int appId;
    private int apkId;
    private String marketName;
    private String name;
    private short catalog;
    private int subCatalog;
    private String subCatalogName;
    private int size;
    private String downloadUrl;
    private String logoUrl;
    private String description;
    private String updateInfo;
    private String publisherShortName;
    private Short minsdkversion;
    private long versionCode;
    private String osversion;
    private String pkname;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastUpdateTime;
    private String detailUrl;
    private float price;
    private String screens;
    private String models;
    private String keywords;
    private float starRating;
    private int viewCount;
    private int downloads;
    private short supportpad;
    private String enumStatus;
    private String strImageUrls;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date marketApkScanTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date marketUpdateTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date appFetchTime;
    private String signatureSha1;
    private String advertises;
    private String adActionTypes;
    private String adPopupTypes;
    private byte adRisk;
    private byte virusKind;
    private String virusBehaviors;
    private String virusName;
    private String permissions;
    private String md5;
    private String packageSjdbMd5;
    private String signatureMd5;
    private String quickMd5;
    private long freeSize;
    private String indexImgUrl = "";
    private String language = "";
    private String shortDesc;
    private byte pathStatus;
    private Integer status;
    private int apkStatus;

    private int scSta = 0;

    public int getScSta() {
        return scSta;
    }

    public void setScSta(int scSta) {
        this.scSta = scSta;
    }

    public MarketApp() {
    }

    public MarketApp(int appId, int apkId, String marketName, String name, short catalog, int subCatalog,
            String subCatalogName, int size, String downloadUrl, String logoUrl, String description,
            String publisherShortName, long versionCode, String osversion, String pkname, Date lastUpdateTime,
            float price, String keywords, float starRating, int viewCount, int downloads, short supportpad,
            String enumStatus, Date marketApkScanTime, Date marketUpdateTime, Date appFetchTime, byte adRisk,
            byte virusKind, long freeSize, String indexImgUrl, String language, byte pathStatus, int apkStatus,
            int scSta) {
        this.appId = appId;
        this.apkId = apkId;
        this.marketName = marketName;
        this.name = name;
        this.catalog = catalog;
        this.subCatalog = subCatalog;
        this.subCatalogName = subCatalogName;
        this.size = size;
        this.downloadUrl = downloadUrl;
        this.logoUrl = logoUrl;
        this.description = description;
        this.publisherShortName = publisherShortName;
        this.versionCode = versionCode;
        this.osversion = osversion;
        this.pkname = pkname;
        this.lastUpdateTime = lastUpdateTime;
        this.price = price;
        this.keywords = keywords;
        this.starRating = starRating;
        this.viewCount = viewCount;
        this.downloads = downloads;
        this.supportpad = supportpad;
        this.enumStatus = enumStatus;
        this.marketApkScanTime = marketApkScanTime;
        this.marketUpdateTime = marketUpdateTime;
        this.appFetchTime = appFetchTime;
        this.adRisk = adRisk;
        this.virusKind = virusKind;
        this.freeSize = freeSize;
        this.indexImgUrl = indexImgUrl;
        this.language = language;
        this.pathStatus = pathStatus;
        this.apkStatus = apkStatus;
        this.scSta = scSta;
    }

    public MarketApp(int appId, int apkId, String marketName, String name, short catalog, int subCatalog,
            String subCatalogName, int size, String downloadUrl, String logoUrl, String description, String updateInfo,
            String publisherShortName, Short minsdkversion, long versionCode, String osversion, String pkname,
            Date lastUpdateTime, String detailUrl, float price, String screens, String models, String keywords,
            float starRating, int viewCount, int downloads, short supportpad, String enumStatus, String strImageUrls,
            Date marketApkScanTime, Date marketUpdateTime, Date appFetchTime, String signatureSha1, String advertises,
            String adActionTypes, String adPopupTypes, byte adRisk, byte virusKind, String virusBehaviors,
            String virusName, String permissions, String md5, String packageSjdbMd5, String signatureMd5,
            String quickMd5, long freeSize, String indexImgUrl, String language, String shortDesc, byte pathStatus,
            Integer status, int apkStatus, String keyWord) {
        this.appId = appId;
        this.apkId = apkId;
        this.marketName = marketName;
        this.name = name;
        this.catalog = catalog;
        this.subCatalog = subCatalog;
        this.subCatalogName = subCatalogName;
        this.size = size;
        this.downloadUrl = downloadUrl;
        this.logoUrl = logoUrl;
        this.description = description;
        this.updateInfo = updateInfo;
        this.publisherShortName = publisherShortName;
        this.minsdkversion = minsdkversion;
        this.versionCode = versionCode;
        this.osversion = osversion;
        this.pkname = pkname;
        this.lastUpdateTime = lastUpdateTime;
        this.detailUrl = detailUrl;
        this.price = price;
        this.screens = screens;
        this.models = models;
        this.keywords = keywords;
        this.starRating = starRating;
        this.viewCount = viewCount;
        this.downloads = downloads;
        this.supportpad = supportpad;
        this.enumStatus = enumStatus;
        this.strImageUrls = strImageUrls;
        this.marketApkScanTime = marketApkScanTime;
        this.marketUpdateTime = marketUpdateTime;
        this.appFetchTime = appFetchTime;
        this.signatureSha1 = signatureSha1;
        this.advertises = advertises;
        this.adActionTypes = adActionTypes;
        this.adPopupTypes = adPopupTypes;
        this.adRisk = adRisk;
        this.virusKind = virusKind;
        this.virusBehaviors = virusBehaviors;
        this.virusName = virusName;
        this.permissions = permissions;
        this.md5 = md5;
        this.packageSjdbMd5 = packageSjdbMd5;
        this.signatureMd5 = signatureMd5;
        this.quickMd5 = quickMd5;
        this.freeSize = freeSize;
        this.indexImgUrl = indexImgUrl;
        this.language = language;
        this.shortDesc = shortDesc;
        this.pathStatus = pathStatus;
        this.status = status;
        this.apkStatus = apkStatus;
    }

    @Override
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    @Column(name = "Version", nullable = false, length = 125)
    public String getVersion() {
        return this.version;
    }

    @Override
    public void setVersion(String version) {
        this.version = version;
    }

    @Column(name = "AppId", nullable = false)
    public int getAppId() {
        return this.appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    @Column(name = "ApkId", nullable = false)
    public int getApkId() {
        return this.apkId;
    }

    public void setApkId(int apkId) {
        this.apkId = apkId;
    }

    @Override
    @Column(name = "MarketName", nullable = false, length = 20)
    public String getMarketName() {
        return this.marketName;
    }

    @Override
    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    @Column(name = "Name", nullable = false, length = 80)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    @Column(name = "Catalog", nullable = false)
    public short getCatalog() {
        return this.catalog;
    }

    public void setCatalog(short catalog) {
        this.catalog = catalog;
    }

    @Column(name = "SubCatalog", nullable = false)
    public int getSubCatalog() {
        return this.subCatalog;
    }

    public void setSubCatalog(int subCatalog) {
        this.subCatalog = subCatalog;
    }

    @Column(name = "SubCatalogName", nullable = false, length = 10)
    public String getSubCatalogName() {
        return this.subCatalogName;
    }

    public void setSubCatalogName(String subCatalogName) {
        this.subCatalogName = subCatalogName;
    }

    @Column(name = "Size", nullable = false)
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    @Column(name = "DownloadUrl", nullable = false, length = 200)
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    @Override
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @Column(name = "LogoUrl", nullable = false, length = 200)
    public String getLogoUrl() {
        return this.logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    @Column(name = "Description", nullable = false, length = 65535)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "UpdateInfo", length = 65535)
    public String getUpdateInfo() {
        return this.updateInfo;
    }

    public void setUpdateInfo(String updateInfo) {
        this.updateInfo = updateInfo == null ? "" : updateInfo;
    }

    @Column(name = "PublisherShortName", nullable = false, length = 145)
    public String getPublisherShortName() {
        return this.publisherShortName;
    }

    public void setPublisherShortName(String publisherShortName) {
        this.publisherShortName = publisherShortName;
    }

    @Column(name = "Minsdkversion")
    public Short getMinsdkversion() {
        return this.minsdkversion;
    }

    public void setMinsdkversion(Short minsdkversion) {
        this.minsdkversion = minsdkversion;
    }

    @Override
    @Column(name = "VersionCode", nullable = false)
    public long getVersionCode() {
        return this.versionCode;
    }

    @Override
    public void setVersionCode(long versionCode) {
        this.versionCode = versionCode;
    }

    @Column(name = "OSVersion", nullable = false, length = 80)
    public String getOsversion() {
        return this.osversion;
    }

    public void setOsversion(String osversion) {
        this.osversion = osversion;
    }

    @Override
    @Column(name = "Pkname", nullable = false, length = 200)
    public String getPkname() {
        return this.pkname;
    }

    @Override
    public void setPkname(String pkname) {
        this.pkname = pkname;
    }

    @Override
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LastUpdateTime", nullable = false, length = 19)
    public Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @Override
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Column(name = "DetailUrl", length = 450)
    public String getDetailUrl() {
        return this.detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    @Column(name = "Price", nullable = false, precision = 5)
    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Column(name = "Screens", length = 200)
    public String getScreens() {
        return this.screens;
    }

    public void setScreens(String screens) {
        this.screens = screens;
    }

    @Column(name = "Models", length = 65535)
    public String getModels() {
        return this.models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    @Column(name = "Keywords", nullable = false, length = 65535)
    public String getKeywords() {
        return this.keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Column(name = "StarRating", nullable = false, precision = 3, scale = 1)
    public float getStarRating() {
        return this.starRating;
    }

    public void setStarRating(float starRating) {
        this.starRating = starRating;
    }

    @Column(name = "ViewCount", nullable = false)
    public int getViewCount() {
        return this.viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    @Column(name = "Downloads", nullable = false)
    public int getDownloads() {
        return this.downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    @Column(name = "Supportpad", nullable = false)
    public short getSupportpad() {
        return this.supportpad;
    }

    public void setSupportpad(short supportpad) {
        this.supportpad = supportpad;
    }

    @Column(name = "EnumStatus", nullable = false, length = 6)
    public String getEnumStatus() {
        return this.enumStatus;
    }

    public void setEnumStatus(String enumStatus) {
        this.enumStatus = enumStatus;
    }

    @Column(name = "StrImageUrls", length = 65535)
    public String getStrImageUrls() {
        return this.strImageUrls;
    }

    public void setStrImageUrls(String strImageUrls) {
        this.strImageUrls = strImageUrls;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MarketApkScanTime", nullable = false, length = 19)
    public Date getMarketApkScanTime() {
        return this.marketApkScanTime;
    }

    public void setMarketApkScanTime(Date marketApkScanTime) {
        this.marketApkScanTime = marketApkScanTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MarketUpdateTime", nullable = false, length = 19)
    public Date getMarketUpdateTime() {
        return this.marketUpdateTime;
    }

    public void setMarketUpdateTime(Date marketUpdateTime) {
        this.marketUpdateTime = marketUpdateTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "AppFetchTime", nullable = false, length = 19)
    public Date getAppFetchTime() {
        return this.appFetchTime;
    }

    public void setAppFetchTime(Date appFetchTime) {
        this.appFetchTime = appFetchTime;
    }

    @Column(name = "SignatureSha1", length = 40)
    public String getSignatureSha1() {
        return this.signatureSha1;
    }

    public void setSignatureSha1(String signatureSha1) {
        this.signatureSha1 = signatureSha1;
    }

    @Column(name = "Advertises", length = 65535)
    public String getAdvertises() {
        return this.advertises;
    }

    public void setAdvertises(String advertises) {
        this.advertises = advertises;
    }

    @Column(name = "AdActionTypes", length = 45)
    public String getAdActionTypes() {
        return this.adActionTypes;
    }

    public void setAdActionTypes(String adActionTypes) {
        this.adActionTypes = adActionTypes;
    }

    @Column(name = "AdPopupTypes", length = 45)
    public String getAdPopupTypes() {
        return this.adPopupTypes;
    }

    public void setAdPopupTypes(String adPopupTypes) {
        this.adPopupTypes = adPopupTypes;
    }

    @Column(name = "AdRisk", nullable = false)
    public byte getAdRisk() {
        return this.adRisk;
    }

    public void setAdRisk(byte adRisk) {
        this.adRisk = adRisk;
    }

    @Column(name = "VirusKind", nullable = false)
    public byte getVirusKind() {
        return this.virusKind;
    }

    public void setVirusKind(byte virusKind) {
        this.virusKind = virusKind;
    }

    @Column(name = "VirusBehaviors", length = 65535)
    public String getVirusBehaviors() {
        return this.virusBehaviors;
    }

    public void setVirusBehaviors(String virusBehaviors) {
        this.virusBehaviors = virusBehaviors;
    }

    @Column(name = "VirusName")
    public String getVirusName() {
        return this.virusName;
    }

    public void setVirusName(String virusName) {
        this.virusName = virusName;
    }

    @Column(name = "Permissions", length = 65535)
    public String getPermissions() {
        return this.permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    @Column(name = "Md5", length = 32)
    public String getMd5() {
        return this.md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    @Column(name = "PackageSjdbMd5", length = 32)
    public String getPackageSjdbMd5() {
        return this.packageSjdbMd5;
    }

    public void setPackageSjdbMd5(String packageSjdbMd5) {
        this.packageSjdbMd5 = packageSjdbMd5;
    }

    @Column(name = "SignatureMD5", length = 32)
    public String getSignatureMd5() {
        return this.signatureMd5;
    }

    public void setSignatureMd5(String signatureMd5) {
        this.signatureMd5 = signatureMd5;
    }

    @Column(name = "QuickMd5", length = 32)
    public String getQuickMd5() {
        return this.quickMd5;
    }

    public void setQuickMd5(String quickMd5) {
        this.quickMd5 = quickMd5;
    }

    @Column(name = "FreeSize", nullable = false)
    public long getFreeSize() {
        return this.freeSize;
    }

    public void setFreeSize(long freeSize) {
        this.freeSize = freeSize;
    }

    @Column(name = "IndexImgUrl", nullable = false, length = 200)
    public String getIndexImgUrl() {
        return this.indexImgUrl;
    }

    public void setIndexImgUrl(String indexImgUrl) {
        this.indexImgUrl = indexImgUrl;
    }

    @Column(name = "Language", nullable = false, length = 10)
    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Column(name = "ShortDesc", length = 45)
    public String getShortDesc() {
        return this.shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    @Column(name = "PathStatus", nullable = false)
    public byte getPathStatus() {
        return this.pathStatus;
    }

    public void setPathStatus(byte pathStatus) {
        this.pathStatus = pathStatus;
    }

    @Transient
    @Column(name = "Status")
    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "ApkStatus", nullable = false)
    public int getApkStatus() {
        return this.apkStatus;
    }

    public void setApkStatus(int apkStatus) {
        this.apkStatus = apkStatus;
    }

    /* manual */
    @Transient
    public String[] getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(String[] imageUrls) {
        this.imageUrls = imageUrls;
    }

    @Override
    public String toString() {
        return new StringBuilder(500).append("MarketApp [id=").append(id).append(", version=").append(version)
                .append(", appId=").append(appId).append(", apkId=").append(apkId).append(", marketName=")
                .append(marketName).append(", name=").append(name).append(", catalog=").append(catalog)
                .append(", subCatalog=").append(subCatalog).append(", subCatalogName=").append(subCatalogName)
                .append(", size=").append(size).append(", downloadUrl=").append(downloadUrl).append(", logoUrl=")
                .append(logoUrl).append(", description=").append(description).append(", updateInfo=")
                .append(updateInfo).append(", publisherShortName=").append(publisherShortName)
                .append(", minsdkversion=").append(minsdkversion).append(", versionCode=").append(versionCode)
                .append(", osversion=").append(osversion).append(", pkname=").append(pkname)
                .append(", lastUpdateTime=").append(lastUpdateTime).append(", detailUrl=").append(detailUrl)
                .append(", price=").append(price).append(", screens=").append(screens).append(", models=")
                .append(models).append(", keywords=").append(keywords).append(", starRating=").append(starRating)
                .append(", viewCount=").append(viewCount).append(", downloads=").append(downloads)
                .append(", supportpad=").append(supportpad).append(", enumStatus=").append(enumStatus)
                .append(", status=").append(status).append(", strImageUrls=").append(strImageUrls)
                .append(", marketApkScanTime=").append(marketApkScanTime).append(", marketUpdateTime=")
                .append(marketUpdateTime).append(", appFetchTime=").append(appFetchTime).append(", signatureSha1=")
                .append(signatureSha1).append(", advertises=").append(advertises).append(", adActionTypes=")
                .append(adActionTypes).append(", adPopupTypes=").append(adPopupTypes).append(", virusKind=")
                .append(virusKind).append(", virusBehaviors=").append(virusBehaviors).append(", virusName=")
                .append(virusName).append(", permissions=").append(permissions).append(", md5=").append(md5)
                .append(", strImageUrls=").append(strImageUrls).append("]").toString();
    }
    /* manual */
}
