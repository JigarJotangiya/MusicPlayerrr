package com.google.gson.internal.sql;

import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import java.sql.Timestamp;
import java.util.Date;

/* renamed from: com.google.gson.internal.sql.a */
/* compiled from: SqlTypesSupport */
public final class C6592a {

    /* renamed from: a */
    public static final boolean f29956a;

    /* renamed from: b */
    public static final DefaultDateTypeAdapter.C6498b<? extends Date> f29957b;

    /* renamed from: c */
    public static final DefaultDateTypeAdapter.C6498b<? extends Date> f29958c;

    /* renamed from: d */
    public static final TypeAdapterFactory f29959d;

    /* renamed from: e */
    public static final TypeAdapterFactory f29960e;

    /* renamed from: f */
    public static final TypeAdapterFactory f29961f;

    /* renamed from: com.google.gson.internal.sql.a$a */
    /* compiled from: SqlTypesSupport */
    class C6593a extends DefaultDateTypeAdapter.C6498b<java.sql.Date> {
        C6593a(Class cls) {
            super(cls);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public java.sql.Date mo25611d(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    /* renamed from: com.google.gson.internal.sql.a$b */
    /* compiled from: SqlTypesSupport */
    class C6594b extends DefaultDateTypeAdapter.C6498b<Timestamp> {
        C6594b(Class cls) {
            super(cls);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Timestamp mo25611d(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f29956a = z;
        if (z) {
            f29957b = new C6593a(java.sql.Date.class);
            f29958c = new C6594b(Timestamp.class);
            f29959d = SqlDateTypeAdapter.f29950b;
            f29960e = SqlTimeTypeAdapter.f29952b;
            f29961f = SqlTimestampTypeAdapter.f29954b;
            return;
        }
        f29957b = null;
        f29958c = null;
        f29959d = null;
        f29960e = null;
        f29961f = null;
    }
}
