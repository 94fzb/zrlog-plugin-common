package com.zrlog.plugin.common.bucket;

public class BucketVO {

    private String bucketName;
    private String accessKey;
    private String secretKey;
    private String host;

    public BucketVO(String bucketName, String accessKey, String secretKey,
                    String host) {
        this.bucketName = bucketName;
        this.accessKey = accessKey;
        this.secretKey = secretKey;
        this.host = host;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
