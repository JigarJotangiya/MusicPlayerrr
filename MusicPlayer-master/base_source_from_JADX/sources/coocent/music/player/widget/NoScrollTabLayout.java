package coocent.music.player.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.C1493k;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.p019v.C1560e;
import com.airbnb.lottie.p027z.C1689b;
import com.google.android.material.tabs.TabLayout;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;

public class NoScrollTabLayout extends TabLayout {

    /* renamed from: b0 */
    boolean f31611b0 = false;

    /* renamed from: c0 */
    private String[] f31612c0;

    /* renamed from: d0 */
    private final int[] f31613d0 = {R.drawable.ic_home_tracks_normal, R.drawable.ic_home_artists_normal, R.drawable.ic_home_albums_normal, R.drawable.ic_home_lists_normal, R.drawable.ic_home_folder_normal};

    public NoScrollTabLayout(Context context) {
        super(context);
        m40705S(context);
    }

    /* renamed from: Q */
    private String m40703Q(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "home_tracks1.json" : "home_folder5.json" : "home_lists4.json" : "home_albums3.json" : "home_artists2.json";
    }

    /* renamed from: R */
    private View m40704R(String str, int i) {
        View inflate = LayoutInflater.from(C8345u.m46327h()).inflate(R.layout.item_tab, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
        textView.setText(str);
        if (i == 0) {
            imageView.setImageDrawable(C8343s.m46303k(R.drawable.ic_home_tracks_pressed, R.color.colorAccent));
            textView.setTextColor(C8343s.m46300h());
        } else {
            imageView.setImageDrawable(C8343s.m46298f(this.f31613d0[i]));
            textView.setTextColor(C8343s.m46295c(R.color.tab_text_color));
        }
        return inflate;
    }

    /* renamed from: S */
    private void m40705S(Context context) {
        this.f31612c0 = C8345u.m46325f(R.array.lybrary_tab_names);
        mo27531U();
    }

    /* renamed from: T */
    static /* synthetic */ ColorFilter m40706T(C1689b bVar) {
        return new PorterDuffColorFilter(C8343s.m46300h(), PorterDuff.Mode.SRC_ATOP);
    }

    /* renamed from: U */
    public void mo27531U() {
        for (int i = 0; i < this.f31612c0.length; i++) {
            TabLayout.C6203g z = mo24785z();
            z.mo24814o(m40704R(this.f31612c0[i], i));
            mo24737e(z);
        }
    }

    public boolean getIsScroll() {
        return this.f31611b0;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.f31611b0 && super.onTouchEvent(motionEvent);
    }

    public void setScroll(boolean z) {
        this.f31611b0 = z;
        LinearLayout linearLayout = (LinearLayout) getChildAt(0);
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt != null) {
                childAt.setEnabled(!z);
            }
        }
    }

    public void setSelectTab(int i) {
        mo24783x(i).mo24811l();
        int tabCount = getTabCount();
        for (int i2 = 0; i2 < tabCount; i2++) {
            View e = mo24783x(i2).mo24804e();
            LottieAnimationView lottieAnimationView = (LottieAnimationView) e.findViewById(R.id.icon);
            TextView textView = (TextView) e.findViewById(R.id.title);
            if (i2 == i) {
                lottieAnimationView.setAnimation(m40703Q(i));
                lottieAnimationView.mo6949s(new C1560e("**"), C1493k.f5721K, C7180d.f31795a);
                lottieAnimationView.mo6924D();
                textView.setTextColor(C8343s.m46300h());
            } else {
                lottieAnimationView.setImageDrawable(C8343s.m46298f(this.f31613d0[i2]));
                textView.setTextColor(C9332d.m49405b(C8345u.m46327h(), R.color.tab_text_color));
            }
        }
    }

    public NoScrollTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40705S(context);
    }
}
