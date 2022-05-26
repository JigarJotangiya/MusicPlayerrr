package com.chad.library.adapter.base.entity;

import java.io.Serializable;

public abstract class SectionEntity<T> implements Serializable {
    public String header;
    public boolean isHeader;

    /* renamed from: t */
    public T f7448t;

    public SectionEntity(boolean z, String str) {
        this.isHeader = z;
        this.header = str;
        this.f7448t = null;
    }

    public SectionEntity(T t) {
        this.isHeader = false;
        this.header = null;
        this.f7448t = t;
    }
}
