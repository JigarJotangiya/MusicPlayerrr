package com.coocent.marquee.p055y;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.core.graphics.drawable.C0534a;
import p082e.p154x.p155a.p156a.C4247i;
import p369i.C8454q;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.coocent.marquee.y.a */
/* compiled from: ColorTineUtil.kt */
public final class C2333a {

    /* renamed from: a */
    public static final C2334a f8191a = new C2334a((C8589g) null);

    /* renamed from: com.coocent.marquee.y.a$a */
    /* compiled from: ColorTineUtil.kt */
    public static final class C2334a {
        private C2334a() {
        }

        /* renamed from: a */
        public final Bitmap mo9130a(Drawable drawable) {
            if (drawable == null) {
                return null;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            if (createBitmap == null) {
                return createBitmap;
            }
            drawable.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        /* renamed from: b */
        public final Drawable mo9131b(Drawable drawable, int i) {
            if (drawable != null) {
                C0534a.m3288n(C0534a.m3292r(drawable), i);
            }
            return drawable;
        }

        /* renamed from: c */
        public final Drawable mo9132c(Context context, int i, int i2) {
            C8594l.m46772f(context, "context");
            BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeResource(context.getResources(), i));
            Drawable mutate = C0534a.m3292r(bitmapDrawable).mutate();
            C8594l.m46768b(mutate, "DrawableCompat.wrap(drawable).mutate()");
            C0534a.m3288n(mutate, i2);
            return bitmapDrawable;
        }

        /* renamed from: d */
        public final Drawable mo9133d(Drawable drawable, int i) {
            if (drawable != null) {
                Drawable mutate = C0534a.m3292r(drawable).mutate();
                C8594l.m46768b(mutate, "DrawableCompat.wrap(it).mutate()");
                C0534a.m3288n(mutate, i);
            }
            return drawable;
        }

        /* renamed from: e */
        public final Drawable mo9134e(Resources resources, int i, int i2) {
            C8594l.m46772f(resources, "res");
            try {
                C4247i b = C4247i.m18660b(resources, i, (Resources.Theme) null);
                if (b != null) {
                    b.mutate();
                    if (b != null) {
                        b.setTint(i2);
                        return b;
                    }
                    throw new C8454q("null cannot be cast to non-null type androidx.vectordrawable.graphics.drawable.VectorDrawableCompat");
                }
                Log.e("ColorTineUtil", "tineVectorMutate is return null !");
                return null;
            } catch (Resources.NotFoundException e) {
                e.printStackTrace();
                return null;
            }
        }

        public /* synthetic */ C2334a(C8589g gVar) {
            this();
        }
    }
}
