package net.coocent.android.xmlparser.gift;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0602j;
import androidx.fragment.app.C0618n;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;
import java.util.List;
import net.coocent.android.xmlparser.C9483n;
import net.coocent.android.xmlparser.C9502v;
import net.coocent.android.xmlparser.ads.AdHelper;
import net.coocent.android.xmlparser.widget.view.tabs.TabLayout;
import p391j.p392a.p393a.C8613f;
import p391j.p392a.p393a.C8614g;
import p391j.p392a.p393a.C8615h;
import p391j.p392a.p393a.C8616i;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class GiftWithGameActivity extends AppCompatActivity implements View.OnClickListener {

    /* renamed from: A */
    private AdView f36358A;

    /* renamed from: z */
    private TabLayout.C9549g f36359z;

    /* renamed from: net.coocent.android.xmlparser.gift.GiftWithGameActivity$a */
    static class C9434a extends C0618n {

        /* renamed from: i */
        private List<String> f36360i;

        C9434a(C0602j jVar, List<String> list) {
            super(jVar, 1);
            this.f36360i = list;
        }

        /* renamed from: e */
        public int mo6295e() {
            return this.f36360i.size();
        }

        /* renamed from: v */
        public Fragment mo4047v(int i) {
            return C9442e.m49754Z2(i);
        }
    }

    /* renamed from: d2 */
    private View m49738d2(CharSequence charSequence, int i) {
        int i2 = 0;
        View inflate = LayoutInflater.from(this).inflate(C8615h.layout_gift_tab, (ViewGroup) null, false);
        AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(C8614g.iv_tab_icon);
        AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(C8614g.tv_tab_title);
        View findViewById = inflate.findViewById(C8614g.iv_dot);
        if (i != C8613f.drawable_game) {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
        appCompatImageView.setImageResource(i);
        appCompatTextView.setText(charSequence);
        return inflate;
    }

    /* renamed from: e2 */
    private void m49739e2() {
        ArrayList<C9483n> m = C9502v.m49942m();
        int i = 8;
        if (m != null && !m.isEmpty()) {
            int min = Math.min(m.size(), 3);
            boolean z = false;
            for (int i2 = 0; i2 < min; i2++) {
                z = C9502v.m49951v(m.get(i2).mo32695g());
                if (z) {
                    break;
                }
            }
            if (this.f36359z.mo32911d() != null) {
                View findViewById = this.f36359z.mo32911d().findViewById(C8614g.iv_dot);
                if (z) {
                    i = 0;
                }
                findViewById.setVisibility(i);
            }
        } else if (this.f36359z.mo32911d() != null) {
            this.f36359z.mo32911d().findViewById(C8614g.iv_dot).setVisibility(8);
        }
    }

    public void onClick(View view) {
        if (view.getId() == C8614g.iv_ads) {
            Toast.makeText(this, C8616i.content_tips, 0).show();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C8615h.activity_gift_with_game);
        TabLayout tabLayout = (TabLayout) findViewById(C8614g.layout_tab);
        ViewPager viewPager = (ViewPager) findViewById(C8614g.view_pager);
        this.f36358A = AdHelper.m49536p().mo32441b(this, (FrameLayout) findViewById(C8614g.layout_bottom));
        mo478Y1((Toolbar) findViewById(C8614g.toolbar));
        mo471R1().mo426y(BuildConfig.FLAVOR);
        mo471R1().mo423v(true);
        mo471R1().mo420s(true);
        ((AppCompatImageView) findViewById(C8614g.iv_ads)).setOnClickListener(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(C8616i.coocent_category_game));
        arrayList.add(getString(C8616i.coocent_category_app));
        viewPager.setAdapter(new C9434a(mo3730H1(), arrayList));
        TabLayout.C9549g y = tabLayout.mo32889y();
        TabLayout.C9549g y2 = tabLayout.mo32889y();
        this.f36359z = y2;
        tabLayout.mo32839e(y2);
        tabLayout.mo32839e(y);
        tabLayout.setupWithViewPager(viewPager);
        this.f36359z.mo32920m(m49738d2((CharSequence) arrayList.get(0), C8613f.drawable_game));
        y.mo32920m(m49738d2((CharSequence) arrayList.get(1), C8613f.drawable_app));
        C9502v.m49920O(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        AdView adView = this.f36358A;
        if (adView != null) {
            adView.mo11151a();
            this.f36358A = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        Window window = getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(5376);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(Color.argb(33, 0, 0, 0));
            if (i >= 23) {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                window.setStatusBarColor(-1);
                window.setNavigationBarColor(Color.argb(33, 0, 0, 0));
                if (i >= 26) {
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                    window.setNavigationBarColor(-1);
                    if (i >= 28) {
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.layoutInDisplayCutoutMode = 1;
                        getWindow().setAttributes(attributes);
                    }
                }
            }
        } else if (i >= 19) {
            window.addFlags(201326592);
        }
        m49739e2();
    }
}
