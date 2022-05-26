package p159f.p166c.p210i.p211a.p212f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0506a;
import androidx.core.graphics.drawable.C0534a;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.i.a.f.b */
/* compiled from: TintUtils.kt */
public final class C4589b {

    /* renamed from: a */
    public static final C4589b f13299a = new C4589b();

    private C4589b() {
    }

    /* renamed from: a */
    public final Drawable mo15334a(Context context, Drawable drawable, int i) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(drawable, "drawable");
        Drawable r = C0534a.m3292r(drawable);
        ColorStateList valueOf = ColorStateList.valueOf(C0506a.m3150b(context, i));
        C8594l.m46770d(valueOf, "ColorStateList.valueOf(C…etColor(context, colors))");
        C0534a.m3289o(r, valueOf);
        C8594l.m46770d(r, "wrappedDrawable");
        return r;
    }
}
