package p159f.p166c.p224o.p225k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.coocent.videolibrary.widget.view.FixedCursorEditText;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.C4624f;

/* renamed from: f.c.o.k.i */
/* compiled from: VideoLayoutDialogSearchBinding */
public final class C4637i implements C4257a {

    /* renamed from: a */
    private final ConstraintLayout f13386a;

    /* renamed from: b */
    public final FixedCursorEditText f13387b;

    /* renamed from: c */
    public final AppCompatImageView f13388c;

    /* renamed from: d */
    public final AppCompatImageView f13389d;

    private C4637i(ConstraintLayout constraintLayout, FixedCursorEditText fixedCursorEditText, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.f13386a = constraintLayout;
        this.f13387b = fixedCursorEditText;
        this.f13388c = appCompatImageView;
        this.f13389d = appCompatImageView2;
    }

    /* renamed from: b */
    public static C4637i m20115b(View view) {
        int i = C4623e.et_search;
        FixedCursorEditText fixedCursorEditText = (FixedCursorEditText) C4258b.m18705a(view, i);
        if (fixedCursorEditText != null) {
            i = C4623e.iv_back;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C4258b.m18705a(view, i);
            if (appCompatImageView != null) {
                i = C4623e.iv_search;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) C4258b.m18705a(view, i);
                if (appCompatImageView2 != null) {
                    return new C4637i((ConstraintLayout) view, fixedCursorEditText, appCompatImageView, appCompatImageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C4637i m20116d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C4624f.video_layout_dialog_search, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20115b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo7577a() {
        return this.f13386a;
    }
}
