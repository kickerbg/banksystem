package com.advanced.bank.bank.system.model;

import java.util.Set;

public class UserSubscription {
    private Long id;
    private Set<Feature> features;
    private Set<FeaturePackage> featurePackage;
    private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public Set<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(Set<Feature> features) {
        this.features = features;
    }

    public Set<FeaturePackage> getFeaturePackage() {
        return featurePackage;
    }

    public void setFeaturePackage(Set<FeaturePackage> featurePackage) {
        this.featurePackage = featurePackage;
    }
}
