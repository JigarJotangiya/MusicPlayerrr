package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.C1719b;
import com.bumptech.glide.load.p030n.C1877k;
import com.bumptech.glide.load.p030n.p031a0.C1802b;
import com.bumptech.glide.p047q.C2152g;
import com.bumptech.glide.p047q.C2153h;
import com.bumptech.glide.p047q.p048l.C2163f;
import com.bumptech.glide.p047q.p048l.C2167j;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.d */
/* compiled from: GlideContext */
public class C1726d extends ContextWrapper {

    /* renamed from: k */
    static final C1743l<?, ?> f6460k = new C1718a();

    /* renamed from: a */
    private final C1802b f6461a;

    /* renamed from: b */
    private final C1732i f6462b;

    /* renamed from: c */
    private final C2163f f6463c;

    /* renamed from: d */
    private final C1719b.C1720a f6464d;

    /* renamed from: e */
    private final List<C2152g<Object>> f6465e;

    /* renamed from: f */
    private final Map<Class<?>, C1743l<?, ?>> f6466f;

    /* renamed from: g */
    private final C1877k f6467g;

    /* renamed from: h */
    private final C1727e f6468h;

    /* renamed from: i */
    private final int f6469i;

    /* renamed from: j */
    private C2153h f6470j;

    public C1726d(Context context, C1802b bVar, C1732i iVar, C2163f fVar, C1719b.C1720a aVar, Map<Class<?>, C1743l<?, ?>> map, List<C2152g<Object>> list, C1877k kVar, C1727e eVar, int i) {
        super(context.getApplicationContext());
        this.f6461a = bVar;
        this.f6462b = iVar;
        this.f6463c = fVar;
        this.f6464d = aVar;
        this.f6465e = list;
        this.f6466f = map;
        this.f6467g = kVar;
        this.f6468h = eVar;
        this.f6469i = i;
    }

    /* renamed from: a */
    public <X> C2167j<ImageView, X> mo7600a(ImageView imageView, Class<X> cls) {
        return this.f6463c.mo8451a(imageView, cls);
    }

    /* renamed from: b */
    public C1802b mo7601b() {
        return this.f6461a;
    }

    /* renamed from: c */
    public List<C2152g<Object>> mo7602c() {
        return this.f6465e;
    }

    /* renamed from: d */
    public synchronized C2153h mo7603d() {
        if (this.f6470j == null) {
            C2153h d = this.f6464d.mo7597d();
            d.mo8369R();
            this.f6470j = d;
        }
        return this.f6470j;
    }

    /* renamed from: e */
    public <T> C1743l<?, T> mo7604e(Class<T> cls) {
        C1743l<?, T> lVar = this.f6466f.get(cls);
        if (lVar == null) {
            for (Map.Entry next : this.f6466f.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    lVar = (C1743l) next.getValue();
                }
            }
        }
        return lVar == null ? f6460k : lVar;
    }

    /* renamed from: f */
    public C1877k mo7605f() {
        return this.f6467g;
    }

    /* renamed from: g */
    public C1727e mo7606g() {
        return this.f6468h;
    }

    /* renamed from: h */
    public int mo7607h() {
        return this.f6469i;
    }

    /* renamed from: i */
    public C1732i mo7608i() {
        return this.f6462b;
    }
}
