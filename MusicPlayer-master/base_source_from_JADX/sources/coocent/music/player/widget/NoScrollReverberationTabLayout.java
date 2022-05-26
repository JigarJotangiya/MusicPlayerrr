package coocent.music.player.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

public class NoScrollReverberationTabLayout extends TabLayout {

    /* renamed from: b0 */
    boolean f31606b0 = false;

    /* renamed from: c0 */
    private String[] f31607c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public C7143b f31608d0;

    /* renamed from: e0 */
    private final int[] f31609e0 = {R.drawable.ic_eq_ic_none, R.drawable.ic_eq_ic_s_room, R.drawable.ic_eq_ic_m_room, R.drawable.ic_eq_ic_l_room, R.drawable.ic_eq_ic_m_hall, R.drawable.ic_eq_ic_l_hall, R.drawable.ic_eq_ic_plate};

    /* renamed from: coocent.music.player.widget.NoScrollReverberationTabLayout$a */
    class C7142a implements TabLayout.C6198d {
        C7142a() {
        }

        /* renamed from: a */
        public void mo24788a(TabLayout.C6203g gVar) {
        }

        /* renamed from: b */
        public void mo24789b(TabLayout.C6203g gVar) {
            NoScrollReverberationTabLayout.this.setSelectTab(gVar.mo24806g());
            if (NoScrollReverberationTabLayout.this.f31608d0 != null) {
                NoScrollReverberationTabLayout.this.f31608d0.mo27530n(gVar);
            }
        }

        /* renamed from: c */
        public void mo24790c(TabLayout.C6203g gVar) {
        }
    }

    /* renamed from: coocent.music.player.widget.NoScrollReverberationTabLayout$b */
    public interface C7143b {
        /* renamed from: n */
        void mo27530n(TabLayout.C6203g gVar);
    }

    public NoScrollReverberationTabLayout(Context context) {
        super(context);
        m40697T(context);
    }

    /* renamed from: R */
    private void m40695R() {
        mo24736d(new C7142a());
    }

    /* renamed from: S */
    private View m40696S(String str, int i) {
        View inflate = LayoutInflater.from(C8345u.m46327h()).inflate(R.layout.item_reverberation_tab, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.reverberation_tab_item_bg);
        textView.setText(str);
        if (i == 0) {
            textView.setVisibility(0);
            textView.setTextColor(C8343s.m46300h());
            imageView2.setBackgroundResource(R.drawable.reverberation_tab_item_rectangle_shape);
            imageView.setImageDrawable(C8343s.m46303k(this.f31609e0[i], R.color.colorAccent));
        } else {
            textView.setVisibility(8);
            textView.setTextColor(-1);
            imageView2.setBackgroundResource(R.drawable.reverberation_tab_item_oval_shape);
            imageView.setImageDrawable(C8343s.m46304l(this.f31609e0[i], R.color.white));
        }
        return inflate;
    }

    /* renamed from: T */
    private void m40697T(Context context) {
        this.f31607c0 = C8345u.m46325f(R.array.reverberation_tab_names);
        mo27524U();
        m40695R();
    }

    /* renamed from: U */
    public void mo27524U() {
        for (int i = 0; i < this.f31607c0.length; i++) {
            TabLayout.C6203g z = mo24785z();
            z.mo24814o(m40696S(this.f31607c0[i], i));
            mo24737e(z);
        }
    }

    public boolean getIsScroll() {
        return this.f31606b0;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.f31606b0 && super.onTouchEvent(motionEvent);
    }

    public void setOnTabSelectListener(C7143b bVar) {
        this.f31608d0 = bVar;
    }

    public void setScroll(boolean z) {
        this.f31606b0 = z;
        LinearLayout linearLayout = (LinearLayout) getChildAt(0);
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt != null) {
                childAt.setEnabled(!z);
            }
        }
    }

    public void setSelectTab(int i) {
        int tabCount = getTabCount();
        for (int i2 = 0; i2 < tabCount; i2++) {
            View e = mo24783x(i2).mo24804e();
            TextView textView = (TextView) e.findViewById(R.id.title);
            ImageView imageView = (ImageView) e.findViewById(R.id.reverberation_tab_item_bg);
            ImageView imageView2 = (ImageView) e.findViewById(R.id.icon);
            if (i == i2) {
                textView.setVisibility(0);
                textView.setTextColor(C8343s.m46300h());
                imageView.setBackgroundResource(R.drawable.reverberation_tab_item_rectangle_shape);
                imageView2.setImageDrawable(C8343s.m46303k(this.f31609e0[i], R.color.colorAccent));
            } else {
                textView.setVisibility(8);
                textView.setTextColor(-1);
                imageView.setBackgroundResource(R.drawable.reverberation_tab_item_oval_shape);
                imageView2.setImageDrawable(C8343s.m46304l(this.f31609e0[i2], R.color.white));
            }
        }
    }

    public NoScrollReverberationTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40697T(context);
    }
}
