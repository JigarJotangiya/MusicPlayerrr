package p159f.p166c.p224o.p225k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.C4624f;

/* renamed from: f.c.o.k.j */
/* compiled from: VideoLayoutDialogSortBinding */
public final class C4638j implements C4257a {

    /* renamed from: a */
    private final ScrollView f13390a;

    /* renamed from: b */
    public final MaterialRadioButton f13391b;

    /* renamed from: c */
    public final MaterialRadioButton f13392c;

    /* renamed from: d */
    public final MaterialRadioButton f13393d;

    /* renamed from: e */
    public final RadioGroup f13394e;

    /* renamed from: f */
    public final RadioGroup f13395f;

    private C4638j(ScrollView scrollView, MaterialRadioButton materialRadioButton, MaterialRadioButton materialRadioButton2, MaterialRadioButton materialRadioButton3, MaterialRadioButton materialRadioButton4, MaterialRadioButton materialRadioButton5, MaterialRadioButton materialRadioButton6, MaterialRadioButton materialRadioButton7, RadioGroup radioGroup, RadioGroup radioGroup2) {
        this.f13390a = scrollView;
        this.f13391b = materialRadioButton4;
        this.f13392c = materialRadioButton6;
        this.f13393d = materialRadioButton7;
        this.f13394e = radioGroup;
        this.f13395f = radioGroup2;
    }

    /* renamed from: b */
    public static C4638j m20119b(View view) {
        int i = C4623e.rb_asc;
        MaterialRadioButton materialRadioButton = (MaterialRadioButton) C4258b.m18705a(view, i);
        if (materialRadioButton != null) {
            i = C4623e.rb_date;
            MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) C4258b.m18705a(view, i);
            if (materialRadioButton2 != null) {
                i = C4623e.rb_desc;
                MaterialRadioButton materialRadioButton3 = (MaterialRadioButton) C4258b.m18705a(view, i);
                if (materialRadioButton3 != null) {
                    i = C4623e.rb_duration;
                    MaterialRadioButton materialRadioButton4 = (MaterialRadioButton) C4258b.m18705a(view, i);
                    if (materialRadioButton4 != null) {
                        i = C4623e.rb_name;
                        MaterialRadioButton materialRadioButton5 = (MaterialRadioButton) C4258b.m18705a(view, i);
                        if (materialRadioButton5 != null) {
                            i = C4623e.rb_quantity;
                            MaterialRadioButton materialRadioButton6 = (MaterialRadioButton) C4258b.m18705a(view, i);
                            if (materialRadioButton6 != null) {
                                i = C4623e.rb_size;
                                MaterialRadioButton materialRadioButton7 = (MaterialRadioButton) C4258b.m18705a(view, i);
                                if (materialRadioButton7 != null) {
                                    i = C4623e.rg_order;
                                    RadioGroup radioGroup = (RadioGroup) C4258b.m18705a(view, i);
                                    if (radioGroup != null) {
                                        i = C4623e.rg_sort;
                                        RadioGroup radioGroup2 = (RadioGroup) C4258b.m18705a(view, i);
                                        if (radioGroup2 != null) {
                                            return new C4638j((ScrollView) view, materialRadioButton, materialRadioButton2, materialRadioButton3, materialRadioButton4, materialRadioButton5, materialRadioButton6, materialRadioButton7, radioGroup, radioGroup2);
                                        }
                                    }
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
    public static C4638j m20120d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C4624f.video_layout_dialog_sort, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20119b(inflate);
    }

    /* renamed from: c */
    public ScrollView mo7577a() {
        return this.f13390a;
    }
}
