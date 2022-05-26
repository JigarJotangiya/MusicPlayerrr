package p159f.p166c.p181e.p182a.p190b.p197l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.C1719b;
import com.bumptech.glide.C1738j;
import com.bumptech.glide.p047q.C2144a;
import com.bumptech.glide.p047q.C2153h;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.b.l.b */
/* compiled from: GlideUtils.kt */
public final class C4476b {

    /* renamed from: a */
    public static final C4476b f13064a = new C4476b();

    private C4476b() {
    }

    /* renamed from: a */
    public final <T> void mo15179a(Context context, T t, int i, ImageView imageView) {
        C2144a h = ((C2153h) ((C2153h) ((C2153h) new C2153h().mo8386h()).mo8391j(i)).mo8375Z(i)).mo8386h();
        C8594l.m46770d(h, "RequestOptions().dontAnimate().error(loadingRes).placeholder(loadingRes)\n                .dontAnimate()");
        C8594l.m46769c(context);
        C1738j<Drawable> p0 = C1719b.m8597t(context).mo7663t(t).mo7637a((C2153h) h);
        C8594l.m46769c(imageView);
        p0.mo7645z0(imageView);
    }
}
