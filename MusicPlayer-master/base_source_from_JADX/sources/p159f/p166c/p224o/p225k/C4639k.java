package p159f.p166c.p224o.p225k;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;
import p159f.p166c.p224o.C4623e;

/* renamed from: f.c.o.k.k */
/* compiled from: VideoLayoutDialogVideoEmptyBinding */
public final class C4639k implements C4257a {

    /* renamed from: a */
    private final LinearLayout f13396a;

    private C4639k(LinearLayout linearLayout, AppCompatImageView appCompatImageView) {
        this.f13396a = linearLayout;
    }

    /* renamed from: b */
    public static C4639k m20123b(View view) {
        int i = C4623e.iv_empty;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C4258b.m18705a(view, i);
        if (appCompatImageView != null) {
            return new C4639k((LinearLayout) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayout mo7577a() {
        return this.f13396a;
    }
}
