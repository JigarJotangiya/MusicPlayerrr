package com.p256kk.taurus.playerbase.p264h;

import android.util.LruCache;

/* renamed from: com.kk.taurus.playerbase.h.f */
/* compiled from: RecordCache */
public class C6684f {

    /* renamed from: a */
    private LruCache<String, Integer> f30082a;

    /* renamed from: com.kk.taurus.playerbase.h.f$a */
    /* compiled from: RecordCache */
    class C6685a extends LruCache<String, Integer> {
        C6685a(C6684f fVar, int i) {
            super(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int sizeOf(String str, Integer num) {
            return 4;
        }
    }

    public C6684f(int i) {
        this.f30082a = new C6685a(this, i * 4);
    }

    /* renamed from: a */
    public int mo26030a(String str) {
        Integer num = this.f30082a.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: b */
    public int mo26031b(String str, int i) {
        Integer put = this.f30082a.put(str, Integer.valueOf(i));
        if (put != null) {
            return put.intValue();
        }
        return -1;
    }
}
