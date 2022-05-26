package p159f.p166c.p224o.p225k;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;
import p159f.p166c.p224o.C4623e;

/* renamed from: f.c.o.k.f */
/* compiled from: VideoLayoutDialogPermissionBinding */
public final class C4634f implements C4257a {

    /* renamed from: a */
    private final LinearLayout f13379a;

    /* renamed from: b */
    public final AppCompatButton f13380b;

    private C4634f(LinearLayout linearLayout, AppCompatButton appCompatButton, AppCompatImageView appCompatImageView, LinearLayout linearLayout2, AppCompatTextView appCompatTextView) {
        this.f13379a = linearLayout;
        this.f13380b = appCompatButton;
    }

    /* renamed from: b */
    public static C4634f m20104b(View view) {
        int i = C4623e.btn_permission;
        AppCompatButton appCompatButton = (AppCompatButton) C4258b.m18705a(view, i);
        if (appCompatButton != null) {
            i = C4623e.iv_photo;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C4258b.m18705a(view, i);
            if (appCompatImageView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i = C4623e.tv_tips_permission;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C4258b.m18705a(view, i);
                if (appCompatTextView != null) {
                    return new C4634f(linearLayout, appCompatButton, appCompatImageView, linearLayout, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayout mo7577a() {
        return this.f13379a;
    }
}
