package p402l.p406b.p426c.p431t;

import java.util.logging.Logger;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.t.a */
/* compiled from: AbstractID3Tag */
public abstract class C9172a extends C9184e {

    /* renamed from: i */
    public static Logger f35808i = Logger.getLogger("org.jaudiotagger.tag.id3");

    /* renamed from: h */
    private String f35809h = BuildConfig.FLAVOR;

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public String mo31847k() {
        return this.f35809h;
    }

    /* renamed from: l */
    public abstract byte mo31848l();

    /* renamed from: m */
    public abstract byte mo31849m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo31850n(String str) {
        this.f35809h = str;
    }
}
