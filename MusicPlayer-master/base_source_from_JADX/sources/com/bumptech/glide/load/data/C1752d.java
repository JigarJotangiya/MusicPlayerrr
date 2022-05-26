package com.bumptech.glide.load.data;

import com.bumptech.glide.C1730g;
import com.bumptech.glide.load.C1744a;

/* renamed from: com.bumptech.glide.load.data.d */
/* compiled from: DataFetcher */
public interface C1752d<T> {

    /* renamed from: com.bumptech.glide.load.data.d$a */
    /* compiled from: DataFetcher */
    public interface C1753a<T> {
        /* renamed from: c */
        void mo7704c(Exception exc);

        /* renamed from: f */
        void mo7705f(T t);
    }

    /* renamed from: a */
    Class<T> mo7688a();

    /* renamed from: b */
    void mo7693b();

    void cancel();

    /* renamed from: d */
    C1744a mo7696d();

    /* renamed from: e */
    void mo7697e(C1730g gVar, C1753a<? super T> aVar);
}
