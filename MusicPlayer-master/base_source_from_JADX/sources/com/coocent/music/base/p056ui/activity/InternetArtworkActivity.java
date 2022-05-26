package com.coocent.music.base.p056ui.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.p003d.C0524f;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C0916y;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.coocent.music.base.data.entity.C2341a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import p159f.p166c.p181e.p182a.p183a.p189f.C4439d;
import p159f.p166c.p181e.p182a.p183a.p189f.C4443g;
import p159f.p166c.p181e.p182a.p183a.p189f.C4446i;
import p159f.p166c.p181e.p182a.p190b.C4447a;
import p159f.p166c.p181e.p182a.p190b.C4448b;
import p159f.p166c.p181e.p182a.p190b.C4449c;
import p159f.p166c.p181e.p182a.p190b.C4452f;
import p159f.p166c.p181e.p182a.p190b.p191h.C4458d;
import p159f.p166c.p181e.p182a.p190b.p197l.C4484g;

/* renamed from: com.coocent.music.base.ui.activity.InternetArtworkActivity */
public class InternetArtworkActivity extends AppCompatActivity {

    /* renamed from: A */
    ProgressBar f8238A;

    /* renamed from: B */
    TextView f8239B;

    /* renamed from: C */
    private RecyclerView f8240C;

    /* renamed from: D */
    private TextView f8241D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public List<C2341a> f8242E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C4458d f8243F;

    /* renamed from: G */
    private String f8244G = "https://cn.bing.com/images/search?first=1&tsc=ImageHoverTitle&form=BESBTB&ensearch=1&q=";

    /* renamed from: H */
    private String f8245H;

    /* renamed from: I */
    private int f8246I = -1;

    /* renamed from: J */
    private long f8247J = -1;

    /* renamed from: K */
    private int f8248K = -1;

    /* renamed from: L */
    private RelativeLayout f8249L;

    /* renamed from: M */
    private C2349c f8250M;

    /* renamed from: N */
    private RelativeLayout f8251N;

    /* renamed from: O */
    private ImageView f8252O;

    /* renamed from: P */
    private final C4458d.C4459a f8253P = new C2362l(this);

    /* renamed from: z */
    private C2348b f8254z;

    /* renamed from: com.coocent.music.base.ui.activity.InternetArtworkActivity$b */
    private static class C2348b extends AsyncTask<Void, Void, List<C2341a>> {

        /* renamed from: a */
        WeakReference<InternetArtworkActivity> f8255a;

        /* renamed from: b */
        boolean f8256b = false;

        public C2348b(InternetArtworkActivity internetArtworkActivity) {
            this.f8255a = new WeakReference<>(internetArtworkActivity);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<C2341a> doInBackground(Void... voidArr) {
            InternetArtworkActivity internetArtworkActivity = (InternetArtworkActivity) this.f8255a.get();
            ArrayList arrayList = new ArrayList();
            if (internetArtworkActivity != null) {
                try {
                    internetArtworkActivity.m11098w2(arrayList);
                    internetArtworkActivity.m11099x2(arrayList);
                } catch (Exception e) {
                    e.printStackTrace();
                    this.f8256b = true;
                    Objects.requireNonNull(internetArtworkActivity);
                    internetArtworkActivity.runOnUiThread(new C2360j(internetArtworkActivity));
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(List<C2341a> list) {
            InternetArtworkActivity internetArtworkActivity;
            super.onPostExecute(list);
            if (!this.f8256b && (internetArtworkActivity = (InternetArtworkActivity) this.f8255a.get()) != null) {
                ProgressBar progressBar = internetArtworkActivity.f8238A;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                if (isCancelled()) {
                    return;
                }
                if (list == null || internetArtworkActivity.f8243F == null) {
                    internetArtworkActivity.m11081D2();
                } else if (list.size() > 0) {
                    if (internetArtworkActivity.f8242E == null) {
                        List unused = internetArtworkActivity.f8242E = new ArrayList();
                    }
                    internetArtworkActivity.f8242E.clear();
                    internetArtworkActivity.f8242E.addAll(list);
                    internetArtworkActivity.f8243F.notifyDataSetChanged();
                } else {
                    internetArtworkActivity.f8239B.setText(internetArtworkActivity.getResources().getString(C4452f.artwork_no_result));
                    internetArtworkActivity.f8239B.setVisibility(0);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            ProgressBar progressBar;
            super.onPreExecute();
            InternetArtworkActivity internetArtworkActivity = (InternetArtworkActivity) this.f8255a.get();
            if (internetArtworkActivity != null && (progressBar = internetArtworkActivity.f8238A) != null) {
                progressBar.setVisibility(0);
            }
        }
    }

    /* renamed from: com.coocent.music.base.ui.activity.InternetArtworkActivity$c */
    private class C2349c extends BroadcastReceiver {
        private C2349c() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction().equals("WAKEUP.EXIT")) {
                InternetArtworkActivity.this.finish();
            }
        }
    }

    /* renamed from: A2 */
    private void m11078A2() {
        int i = C4484g.f13082b;
        if (i > 0) {
            ((RelativeLayout.LayoutParams) this.f8251N.getLayoutParams()).topMargin = i;
        }
    }

    /* renamed from: B2 */
    private void m11079B2() {
        C2361k kVar = new C2361k(this);
        this.f8241D.setOnClickListener(kVar);
        this.f8252O.setOnClickListener(kVar);
        this.f8243F.mo15149g(this.f8253P);
    }

    /* renamed from: C2 */
    private void m11080C2() {
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= 21) {
            window.setNavigationBarColor(C0524f.m3223d(getResources(), C4447a.art_work_navigation_bg_color, (Resources.Theme) null));
        }
        C4484g.m19687a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public void m11081D2() {
        this.f8239B.setVisibility(0);
        ProgressBar progressBar = this.f8238A;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    /* renamed from: E2 */
    public static void m11082E2(Activity activity, long j, int i, int i2, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("artwork_for_id", j);
        bundle.putInt("artwork_type", i);
        bundle.putInt("artwork_position", i2);
        bundle.putString("artwork_query", str);
        Intent intent = new Intent(activity, InternetArtworkActivity.class);
        intent.putExtra("artwork_bundle", bundle);
        activity.startActivityForResult(intent, 1021);
    }

    /* renamed from: F2 */
    public static void m11083F2(Fragment fragment, long j, int i, int i2, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("artwork_for_id", j);
        bundle.putInt("artwork_type", i);
        bundle.putInt("artwork_position", i2);
        bundle.putString("artwork_query", str);
        Intent intent = new Intent(fragment.mo3651a0(), InternetArtworkActivity.class);
        intent.putExtra("artwork_bundle", bundle);
        fragment.mo3634T2(intent, 1021);
    }

    /* renamed from: l2 */
    private void m11090l2() {
        Bundle bundleExtra = getIntent().getBundleExtra("artwork_bundle");
        this.f8246I = bundleExtra.getInt("artwork_type", -1);
        this.f8247J = bundleExtra.getLong("artwork_for_id", -1);
        this.f8248K = bundleExtra.getInt("artwork_position", -1);
        String string = bundleExtra.getString("artwork_query");
        this.f8245H = string;
        if (this.f8246I == -1 || this.f8247J == -1) {
            Toast.makeText(this, C4452f.page_error, 1).show();
            finish();
        } else if (string == null || string.trim().isEmpty()) {
            Toast.makeText(this, C4452f.page_error, 1).show();
            finish();
        }
    }

    /* renamed from: m2 */
    private void m11091m2() {
        mo9271d2();
    }

    /* renamed from: n2 */
    private void m11092n2() {
        ArrayList arrayList = new ArrayList();
        this.f8242E = arrayList;
        C4458d dVar = new C4458d(this, arrayList);
        this.f8243F = dVar;
        dVar.setHasStableIds(true);
        ((C0916y) this.f8240C.getItemAnimator()).mo5428V(false);
        this.f8240C.setAdapter(this.f8243F);
        this.f8240C.setLayoutManager(new GridLayoutManager(this, 3));
    }

    /* renamed from: o2 */
    private void m11093o2() {
        this.f8250M = new C2349c();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("WAKEUP.EXIT");
        registerReceiver(this.f8250M, intentFilter);
    }

    /* renamed from: p2 */
    private void m11094p2() {
        setContentView(C4449c.activity_network_artwork);
        TextView textView = (TextView) findViewById(C4448b.text_tip_click);
        this.f8241D = textView;
        textView.getPaint().setFlags(8);
        this.f8240C = (RecyclerView) findViewById(C4448b.recylerview);
        this.f8238A = (ProgressBar) findViewById(C4448b.progressbar);
        this.f8239B = (TextView) findViewById(C4448b.connect_error);
        this.f8240C.setHasFixedSize(true);
        this.f8240C.setNestedScrollingEnabled(false);
        this.f8249L = (RelativeLayout) findViewById(C4448b.bottom_control);
        this.f8251N = (RelativeLayout) findViewById(C4448b.rl_title);
        this.f8252O = (ImageView) findViewById(C4448b.iv_back);
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public /* synthetic */ void mo9272r2(C4458d dVar, List list, int i) {
        C2341a aVar;
        if (dVar != null && (aVar = (C2341a) list.get(i)) != null) {
            String a = aVar.mo9260a();
            Intent intent = new Intent("artwork_item_notify");
            intent.putExtra("artwork_url", a);
            intent.putExtra("artwork_type", this.f8246I);
            intent.putExtra("artwork_id", this.f8247J);
            intent.putExtra("artwork_position", this.f8248K);
            setResult(1022, intent);
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public /* synthetic */ void mo9273t2(int i) {
        if (i == 1) {
            m11100y2(C4446i.f13022a.mo15137b(this));
        } else {
            m11100y2(C4446i.f13022a.mo15136a(this, 5));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public /* synthetic */ void mo9274v2(View view) {
        if (view.getId() == C4448b.text_tip_click) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f8244G + this.f8245H + " album")));
        } else if (view.getId() == C4448b.iv_back) {
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public void m11098w2(List<C2341a> list) throws IOException {
        try {
            this.f8244G = "https://cn.bing.com/images/search?first=1&tsc=ImageBasicHover&q=";
            Elements select = Jsoup.connect("https://cn.bing.com/images/search?first=1&tsc=ImageBasicHover&q=" + this.f8245H + " album").userAgent("Mozilla/5.0 (jsoup)").timeout(60000).get().getElementsByClass("dgControl_list").select("a");
            for (int i = 0; i < select.size(); i++) {
                try {
                    String string = new JSONObject(((Element) select.get(i)).attr("m")).getString("murl");
                    if (string != null && !string.isEmpty() && list.size() < 15) {
                        list.add(new C2341a((long) i, string));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public void m11099x2(List<C2341a> list) {
        try {
            this.f8244G = "https://www.google.com/search?site=imghp&tbm=isch&q=";
            Elements select = Jsoup.connect("https://www.google.com/search?site=imghp&tbm=isch&q=" + this.f8245H + " album").userAgent("Mozilla/5.0 (jsoup)").timeout(15000).get().getElementsByClass("GpQGbf").select("img");
            for (int i = 0; i < select.size(); i++) {
                if (list.size() < 30) {
                    list.add(new C2341a((long) i, ((Element) select.get(i)).attr("src")));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: y2 */
    private void m11100y2(int i) {
        RelativeLayout relativeLayout = this.f8249L;
        if (relativeLayout != null) {
            relativeLayout.setPadding(relativeLayout.getPaddingLeft(), this.f8249L.getPaddingTop(), this.f8249L.getPaddingRight(), i);
        }
    }

    /* renamed from: z2 */
    private void m11101z2() {
    }

    /* renamed from: d2 */
    public void mo9271d2() {
        if (!C4439d.f13014a.mo15096a(this)) {
            m11081D2();
            return;
        }
        C2348b bVar = this.f8254z;
        if (bVar != null && bVar.getStatus() == AsyncTask.Status.RUNNING) {
            this.f8254z.cancel(true);
            this.f8254z = null;
        }
        C2348b bVar2 = new C2348b(this);
        this.f8254z = bVar2;
        bVar2.executeOnExecutor(Executors.newCachedThreadPool(), new Void[0]);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m11080C2();
        m11094p2();
        m11090l2();
        m11092n2();
        m11101z2();
        m11091m2();
        m11078A2();
        m11079B2();
        m11093o2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C2348b bVar = this.f8254z;
        if (bVar != null) {
            bVar.cancel(true);
            this.f8254z = null;
        }
        if (this.f8240C != null) {
            this.f8240C = null;
        }
        if (this.f8243F != null) {
            this.f8243F = null;
        }
        if (this.f8238A != null) {
            this.f8238A = null;
        }
        List<C2341a> list = this.f8242E;
        if (list != null) {
            list.clear();
            this.f8242E = null;
        }
        if (this.f8249L != null) {
            this.f8249L = null;
        }
        C2349c cVar = this.f8250M;
        if (cVar != null) {
            unregisterReceiver(cVar);
            this.f8250M = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C4443g.f13019a.mo15134b(this, new C2359i(this));
    }
}
