package coocent.music.player.skin.p274c;

import android.content.Context;
import coocent.music.player.skin.p273b.C7102b;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: coocent.music.player.skin.c.e */
/* compiled from: InflaterUtil */
public class C7109e {

    /* renamed from: b */
    private static C7109e f31387b;

    /* renamed from: a */
    private C7102b f31388a = null;

    public C7109e(Context context) {
        C7102b e = C7102b.m40441e();
        this.f31388a = e;
        e.mo27296k(context, BuildConfig.FLAVOR);
    }

    /* renamed from: a */
    public static C7109e m40466a(Context context) {
        if (f31387b == null) {
            f31387b = new C7109e(context);
        }
        return f31387b;
    }
}
