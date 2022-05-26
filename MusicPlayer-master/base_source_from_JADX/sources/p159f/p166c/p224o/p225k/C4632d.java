package p159f.p166c.p224o.p225k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.C4624f;

/* renamed from: f.c.o.k.d */
/* compiled from: VideoLayoutDialogEncryptBinding */
public final class C4632d implements C4257a {

    /* renamed from: a */
    private final RelativeLayout f13367a;

    /* renamed from: b */
    public final AppCompatImageView f13368b;

    /* renamed from: c */
    public final AppCompatImageView f13369c;

    /* renamed from: d */
    public final AppCompatTextView f13370d;

    private C4632d(RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView) {
        this.f13367a = relativeLayout;
        this.f13368b = appCompatImageView;
        this.f13369c = appCompatImageView2;
        this.f13370d = appCompatTextView;
    }

    /* renamed from: b */
    public static C4632d m20096b(View view) {
        int i = C4623e.iv_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C4258b.m18705a(view, i);
        if (appCompatImageView != null) {
            i = C4623e.iv_title_icon;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C4258b.m18705a(view, i);
            if (appCompatImageView2 != null) {
                i = C4623e.tv_encrypted;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C4258b.m18705a(view, i);
                if (appCompatTextView != null) {
                    return new C4632d((RelativeLayout) view, appCompatImageView, appCompatImageView2, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C4632d m20097d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C4624f.video_layout_dialog_encrypt, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20096b(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo7577a() {
        return this.f13367a;
    }
}
