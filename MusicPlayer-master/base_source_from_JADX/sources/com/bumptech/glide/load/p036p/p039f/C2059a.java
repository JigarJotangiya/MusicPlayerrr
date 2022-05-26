package com.bumptech.glide.load.p036p.p039f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0506a;
import androidx.core.content.p003d.C0524f;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p083a.p090o.C3435d;

/* renamed from: com.bumptech.glide.load.p.f.a */
/* compiled from: DrawableDecoderCompat */
public final class C2059a {

    /* renamed from: a */
    private static volatile boolean f7101a = true;

    /* renamed from: a */
    public static Drawable m9659a(Context context, int i, Resources.Theme theme) {
        return m9661c(context, context, i, theme);
    }

    /* renamed from: b */
    public static Drawable m9660b(Context context, Context context2, int i) {
        return m9661c(context, context2, i, (Resources.Theme) null);
    }

    /* renamed from: c */
    private static Drawable m9661c(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f7101a) {
                return m9663e(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f7101a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C0506a.m3152d(context2, i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m9662d(context2, i, theme);
    }

    /* renamed from: d */
    private static Drawable m9662d(Context context, int i, Resources.Theme theme) {
        return C0524f.m3225f(context.getResources(), i, theme);
    }

    /* renamed from: e */
    private static Drawable m9663e(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            context = new C3435d(context, theme);
        }
        return C3410a.m14543d(context, i);
    }
}
