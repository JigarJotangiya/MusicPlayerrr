package net.coocent.android.xmlparser.gift;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.C0854g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import net.coocent.android.xmlparser.C9483n;
import net.coocent.android.xmlparser.C9488q;
import net.coocent.android.xmlparser.C9502v;
import net.coocent.android.xmlparser.gift.C9438d;
import net.coocent.android.xmlparser.gift.GiftConfig;
import p082e.p109h.p118o.C3699e;
import p391j.p392a.p393a.C8612e;
import p391j.p392a.p393a.C8614g;
import p391j.p392a.p393a.C8615h;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class GiftListActivity extends AppCompatActivity implements C9488q {
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C9438d f36355z;

    /* renamed from: net.coocent.android.xmlparser.gift.GiftListActivity$a */
    class C9433a implements C9438d.C9441c {

        /* renamed from: a */
        final /* synthetic */ SharedPreferences f36356a;

        C9433a(SharedPreferences sharedPreferences) {
            this.f36356a = sharedPreferences;
        }

        /* renamed from: a */
        public void mo32558a(View view, int i) {
            C9483n d = GiftListActivity.this.f36355z.mo32562d(i);
            if (d != null && !TextUtils.isEmpty(d.mo32695g())) {
                this.f36356a.edit().putString(d.mo32695g(), d.mo32695g()).apply();
                try {
                    Uri parse = Uri.parse(("market://details?id=" + d.mo32695g()) + "&referrer=utm_source%3Dcoocent_Promotion_v2_" + C9502v.m49941l() + "%26utm_medium%3Dclick_download");
                    Intent action = GiftListActivity.this.getPackageManager().getLaunchIntentForPackage("com.android.vending").setAction("android.intent.action.VIEW");
                    action.setData(parse);
                    GiftListActivity.this.startActivity(action);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                C9502v.m49917L(GiftListActivity.this, "gift", new C3699e("gift_list", d.mo32695g()));
                GiftListActivity.this.f36355z.notifyItemChanged(i);
            }
        }
    }

    /* renamed from: f0 */
    public boolean mo26665f0(ArrayList<C9483n> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return true;
        }
        this.f36355z.mo32566h(arrayList);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C8615h.activity_gift_list);
        GiftConfig giftConfig = (GiftConfig) getIntent().getParcelableExtra("gift_config");
        if (giftConfig == null) {
            giftConfig = new GiftConfig.C9432b().mo32556f();
        }
        Window window = getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 21 && i < 23) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(giftConfig.mo32549e() == 0 ? Color.argb(33, 0, 0, 0) : giftConfig.mo32547a());
        } else if (i >= 23) {
            window.getDecorView().setSystemUiVisibility(1024);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(giftConfig.mo32547a());
            if (giftConfig.mo32549e() == 0) {
                window.getDecorView().setSystemUiVisibility(8192);
            }
        }
        C9502v.m49920O(this);
        LinearLayout linearLayout = (LinearLayout) findViewById(C8614g.ll_container);
        Toolbar toolbar = (Toolbar) findViewById(C8614g.toolbar);
        TextView textView = (TextView) findViewById(C8614g.tv_title);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(C8614g.iv_ads);
        RecyclerView recyclerView = (RecyclerView) findViewById(C8614g.rv_gift);
        toolbar.setBackgroundColor(giftConfig.mo32547a());
        mo478Y1(toolbar);
        if (mo471R1() != null) {
            mo471R1().mo426y(BuildConfig.FLAVOR);
            mo471R1().mo423v(true);
            mo471R1().mo420s(true);
        }
        if (giftConfig.mo32549e() == 0) {
            if (toolbar.getNavigationIcon() != null) {
                toolbar.getNavigationIcon().setColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
            }
            textView.setTextColor(-16777216);
        } else if (giftConfig.mo32549e() == 1) {
            if (toolbar.getNavigationIcon() != null) {
                toolbar.getNavigationIcon().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
            }
            linearLayout.setBackgroundColor(giftConfig.mo32550f());
            textView.setTextColor(-1);
            appCompatImageView.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        } else {
            if (toolbar.getNavigationIcon() != null) {
                toolbar.getNavigationIcon().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
            }
            textView.setTextColor(-1);
            appCompatImageView.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new C0854g());
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        recyclerView.mo4622h(new C9446f(getResources().getDimensionPixelSize(C8612e.gift_default_divider), Color.parseColor("#F5F5F5")));
        C9438d dVar = new C9438d();
        this.f36355z = dVar;
        recyclerView.setAdapter(dVar);
        this.f36355z.mo32565g(new C9433a(PreferenceManager.getDefaultSharedPreferences(this)));
        if (C9502v.m49930a() != null) {
            this.f36355z.mo32566h(C9502v.m49930a());
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
