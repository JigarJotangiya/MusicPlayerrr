package p159f.p166c.p224o.p225k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.C4624f;

/* renamed from: f.c.o.k.e */
/* compiled from: VideoLayoutDialogInfoBinding */
public final class C4633e implements C4257a {

    /* renamed from: a */
    private final LinearLayout f13371a;

    /* renamed from: b */
    public final AppCompatTextView f13372b;

    /* renamed from: c */
    public final AppCompatTextView f13373c;

    /* renamed from: d */
    public final AppCompatTextView f13374d;

    /* renamed from: e */
    public final AppCompatTextView f13375e;

    /* renamed from: f */
    public final AppCompatTextView f13376f;

    /* renamed from: g */
    public final AppCompatTextView f13377g;

    /* renamed from: h */
    public final AppCompatTextView f13378h;

    private C4633e(LinearLayout linearLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7) {
        this.f13371a = linearLayout;
        this.f13372b = appCompatTextView;
        this.f13373c = appCompatTextView2;
        this.f13374d = appCompatTextView3;
        this.f13375e = appCompatTextView4;
        this.f13376f = appCompatTextView5;
        this.f13377g = appCompatTextView6;
        this.f13378h = appCompatTextView7;
    }

    /* renamed from: b */
    public static C4633e m20100b(View view) {
        int i = C4623e.tv_details_date_modified;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C4258b.m18705a(view, i);
        if (appCompatTextView != null) {
            i = C4623e.tv_details_duration;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C4258b.m18705a(view, i);
            if (appCompatTextView2 != null) {
                i = C4623e.tv_details_format;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) C4258b.m18705a(view, i);
                if (appCompatTextView3 != null) {
                    i = C4623e.tv_details_location;
                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) C4258b.m18705a(view, i);
                    if (appCompatTextView4 != null) {
                        i = C4623e.tv_details_name;
                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) C4258b.m18705a(view, i);
                        if (appCompatTextView5 != null) {
                            i = C4623e.tv_details_resolution;
                            AppCompatTextView appCompatTextView6 = (AppCompatTextView) C4258b.m18705a(view, i);
                            if (appCompatTextView6 != null) {
                                i = C4623e.tv_details_size;
                                AppCompatTextView appCompatTextView7 = (AppCompatTextView) C4258b.m18705a(view, i);
                                if (appCompatTextView7 != null) {
                                    return new C4633e((LinearLayout) view, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C4633e m20101d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C4624f.video_layout_dialog_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20100b(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo7577a() {
        return this.f13371a;
    }
}
