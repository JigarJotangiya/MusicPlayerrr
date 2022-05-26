package coocent.music.player.activity;

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
import androidx.core.content.p003d.C0524f;
import androidx.recyclerview.widget.C0916y;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import coocent.music.player.adapter.ArtWorkAdapter;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.mode.C7056a;
import coocent.music.player.widget.DeepDefaultTitle;
import coocent.musiclibrary.music.p292j.C7397j;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.p461z.C9566f;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import p342g.p343a.p344a.p346c.C7970w;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8334l;
import p342g.p343a.p344a.p358i.C8340q;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;

public class InternetArtworkActivity extends AnimationActivity {

    /* renamed from: A */
    ProgressBar f30594A;

    /* renamed from: B */
    TextView f30595B;

    /* renamed from: C */
    private RecyclerView f30596C;

    /* renamed from: D */
    private TextView f30597D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public List<C7056a> f30598E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public ArtWorkAdapter f30599F;

    /* renamed from: G */
    private String f30600G = "https://cn.bing.com/images/search?first=1&tsc=ImageHoverTitle&form=BESBTB&ensearch=1&q=";

    /* renamed from: H */
    private String f30601H;

    /* renamed from: I */
    private int f30602I = -1;

    /* renamed from: J */
    private long f30603J = -1;

    /* renamed from: K */
    private int f30604K = -1;

    /* renamed from: L */
    private DeepDefaultTitle f30605L;

    /* renamed from: M */
    private ImageView f30606M;

    /* renamed from: N */
    private RelativeLayout f30607N;

    /* renamed from: O */
    private C6869c f30608O;

    /* renamed from: P */
    C7970w f30609P = new C6867a();

    /* renamed from: Q */
    private final BaseQuickAdapter.OnItemClickListener f30610Q = new C6993p(this);

    /* renamed from: z */
    private C6868b f30611z;

    /* renamed from: coocent.music.player.activity.InternetArtworkActivity$a */
    class C6867a extends C7970w {
        C6867a() {
        }

        /* renamed from: t */
        public void mo26591t() {
            InternetArtworkActivity.this.finish();
        }
    }

    /* renamed from: coocent.music.player.activity.InternetArtworkActivity$b */
    private static class C6868b extends AsyncTask<Void, Void, List<C7056a>> {

        /* renamed from: a */
        WeakReference<InternetArtworkActivity> f30613a;

        public C6868b(InternetArtworkActivity internetArtworkActivity) {
            this.f30613a = new WeakReference<>(internetArtworkActivity);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<C7056a> doInBackground(Void... voidArr) {
            InternetArtworkActivity internetArtworkActivity = (InternetArtworkActivity) this.f30613a.get();
            ArrayList arrayList = new ArrayList();
            if (internetArtworkActivity != null) {
                try {
                    internetArtworkActivity.m39078w2(arrayList);
                } catch (Exception e) {
                    e.printStackTrace();
                    Objects.requireNonNull(internetArtworkActivity);
                    internetArtworkActivity.runOnUiThread(new C6996q(internetArtworkActivity));
                }
                internetArtworkActivity.m39079x2(arrayList);
            }
            return arrayList;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(List<C7056a> list) {
            super.onPostExecute(list);
            InternetArtworkActivity internetArtworkActivity = (InternetArtworkActivity) this.f30613a.get();
            if (internetArtworkActivity != null) {
                ProgressBar progressBar = internetArtworkActivity.f30594A;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                if (isCancelled()) {
                    return;
                }
                if (list == null || internetArtworkActivity.f30599F == null) {
                    internetArtworkActivity.m39063D2();
                } else if (list.size() > 0) {
                    if (internetArtworkActivity.f30598E == null) {
                        List unused = internetArtworkActivity.f30598E = new ArrayList();
                    }
                    internetArtworkActivity.f30598E.clear();
                    internetArtworkActivity.f30598E.addAll(list);
                    internetArtworkActivity.f30599F.notifyDataSetChanged();
                } else {
                    internetArtworkActivity.f30595B.setText(internetArtworkActivity.getResources().getString(R.string.artwork_no_result));
                    internetArtworkActivity.f30595B.setVisibility(0);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            ProgressBar progressBar;
            super.onPreExecute();
            InternetArtworkActivity internetArtworkActivity = (InternetArtworkActivity) this.f30613a.get();
            if (internetArtworkActivity != null && (progressBar = internetArtworkActivity.f30594A) != null) {
                progressBar.setVisibility(0);
            }
        }
    }

    /* renamed from: coocent.music.player.activity.InternetArtworkActivity$c */
    private class C6869c extends BroadcastReceiver {
        private C6869c() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT")) {
                InternetArtworkActivity.this.finish();
            }
        }

        /* synthetic */ C6869c(InternetArtworkActivity internetArtworkActivity, C6867a aVar) {
            this();
        }
    }

    /* renamed from: A2 */
    private void m39060A2() {
        this.f30606M.setImageDrawable(C9332d.m49407d(this, R.drawable.splash_skin_1_bg_shape));
    }

    /* renamed from: B2 */
    private void m39061B2() {
        this.f30597D.setOnClickListener(new C6999r(this));
        this.f30599F.setOnItemClickListener(this.f30610Q);
    }

    /* renamed from: C2 */
    private void m39062C2() {
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= 21) {
            window.setNavigationBarColor(C0524f.m3223d(getResources(), R.color.sound_effect_bg_color, (Resources.Theme) null));
        }
        C7397j.m41734d(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public void m39063D2() {
        this.f30595B.setVisibility(0);
    }

    /* renamed from: l2 */
    private void m39070l2() {
        Bundle bundleExtra = getIntent().getBundleExtra("artwork_bundle");
        this.f30602I = bundleExtra.getInt("artwork_type", -1);
        this.f30603J = bundleExtra.getLong("artwork_for_id", -1);
        this.f30604K = bundleExtra.getInt("artwork_position", -1);
        String string = bundleExtra.getString("artwork");
        this.f30601H = string;
        if (this.f30602I == -1 || this.f30603J == -1 || this.f30604K == -1) {
            C8344t.m46314b(this, R.string.page_error);
            finish();
        } else if (string == null || string.trim() == null || this.f30601H.trim().isEmpty()) {
            C8344t.m46314b(this, R.string.page_error);
            finish();
        }
    }

    /* renamed from: m2 */
    private void m39071m2() {
        mo26628d2();
    }

    /* renamed from: n2 */
    private void m39072n2() {
        this.f30598E = new ArrayList();
        ArtWorkAdapter artWorkAdapter = new ArtWorkAdapter(R.layout.item_artwork, this.f30598E);
        this.f30599F = artWorkAdapter;
        artWorkAdapter.setHasStableIds(true);
        ((C0916y) this.f30596C.getItemAnimator()).mo5428V(false);
        this.f30596C.setAdapter(this.f30599F);
        this.f30596C.setLayoutManager(new GridLayoutManager(this, 3));
    }

    /* renamed from: o2 */
    private void m39073o2() {
        this.f30608O = new C6869c(this, (C6867a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT");
        registerReceiver(this.f30608O, intentFilter);
    }

    /* renamed from: p2 */
    private void m39074p2() {
        setContentView((int) R.layout.activity_internet_artwork);
        TextView textView = (TextView) findViewById(R.id.text_tip_click);
        this.f30597D = textView;
        textView.getPaint().setFlags(8);
        this.f30596C = (RecyclerView) findViewById(R.id.recylerview);
        this.f30594A = (ProgressBar) findViewById(R.id.progressbar);
        this.f30595B = (TextView) findViewById(R.id.connect_error);
        this.f30606M = (ImageView) findViewById(R.id.iv_bg);
        this.f30596C.setHasFixedSize(true);
        this.f30596C.setNestedScrollingEnabled(false);
        this.f30607N = (RelativeLayout) findViewById(R.id.bottom_control);
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public /* synthetic */ void mo26629r2(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        C7056a aVar;
        if (baseQuickAdapter != null && (aVar = (C7056a) baseQuickAdapter.getItem(i)) != null) {
            String a = aVar.mo27067a();
            Intent intent = new Intent("media.musicplayer.audioplayer.videoplayer.artwork_item_notify");
            intent.putExtra("artwork_url", a);
            intent.putExtra("artwork_type", this.f30602I);
            intent.putExtra("artwork_id", this.f30603J);
            intent.putExtra("artwork_position", this.f30604K);
            setResult(1022, intent);
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public /* synthetic */ void mo26630t2(int i) {
        if (i == 1) {
            m39080y2(BaseApplication.f31157u);
        } else {
            m39080y2(C9566f.m50190a(this, 5));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public /* synthetic */ void mo26631v2(View view) {
        if (view.getId() == R.id.text_tip_click) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f30600G + this.f30601H + " album")));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public void m39078w2(List<C7056a> list) throws IOException {
        this.f30600G = "https://cn.bing.com/images/search?first=1&tsc=ImageBasicHover&q=";
        Elements select = Jsoup.connect("https://cn.bing.com/images/search?first=1&tsc=ImageBasicHover&q=" + this.f30601H + " album").userAgent("Mozilla/5.0 (jsoup)").maxBodySize(Integer.MAX_VALUE).timeout(60000).get().getElementsByClass("dgControl_list").select("a");
        for (int i = 0; i < select.size(); i++) {
            try {
                String string = new JSONObject(((Element) select.get(i)).attr("m")).getString("murl");
                if (string != null && !string.isEmpty() && list.size() < 15) {
                    list.add(new C7056a((long) i, string));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public void m39079x2(List<C7056a> list) {
        try {
            this.f30600G = "https://www.google.com/search?site=imghp&tbm=isch&source=hp&q=";
            Elements select = Jsoup.connect("https://www.google.com/search?site=imghp&tbm=isch&source=hp&q=" + this.f30601H + " album").userAgent("Mozilla/5.0 (jsoup)").timeout(15000).get().getElementsByClass("GpQGbf").select("img");
            for (int i = 0; i < select.size(); i++) {
                if (list.size() < 30) {
                    list.add(new C7056a((long) i, ((Element) select.get(i)).attr("src")));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: y2 */
    private void m39080y2(int i) {
        RelativeLayout relativeLayout = this.f30607N;
        if (relativeLayout != null) {
            relativeLayout.setPadding(relativeLayout.getPaddingLeft(), this.f30607N.getPaddingTop(), this.f30607N.getPaddingRight(), i);
        }
    }

    /* renamed from: z2 */
    private void m39081z2() {
        DeepDefaultTitle deepDefaultTitle = (DeepDefaultTitle) findViewById(R.id.defualt_title);
        this.f30605L = deepDefaultTitle;
        deepDefaultTitle.setHomeIcon(false);
        this.f30605L.setMenuIcon(false);
        this.f30605L.setSearchIcon(false);
        this.f30605L.setEqIcon(false);
        this.f30605L.setTitleBackgroundColor(C8345u.m46326g(R.color.library_title_backgroud_color));
        this.f30605L.setTitleText(C8345u.m46333n(R.string.artwork));
        this.f30605L.mo27431B(true, true);
        this.f30605L.setTitleOnClickListener(this.f30609P);
    }

    /* renamed from: d2 */
    public void mo26628d2() {
        if (!C8334l.m46054a(this)) {
            m39063D2();
            return;
        }
        C6868b bVar = this.f30611z;
        if (bVar != null && bVar.getStatus() == AsyncTask.Status.RUNNING) {
            this.f30611z.cancel(true);
            this.f30611z = null;
        }
        C6868b bVar2 = new C6868b(this);
        this.f30611z = bVar2;
        bVar2.executeOnExecutor(Executors.newCachedThreadPool(), new Void[0]);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m39062C2();
        m39074p2();
        m39070l2();
        m39072n2();
        m39081z2();
        m39071m2();
        m39060A2();
        m39061B2();
        m39073o2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C6868b bVar = this.f30611z;
        if (bVar != null) {
            bVar.cancel(true);
            this.f30611z = null;
        }
        if (this.f30596C != null) {
            this.f30596C = null;
        }
        if (this.f30599F != null) {
            this.f30599F = null;
        }
        if (this.f30594A != null) {
            this.f30594A = null;
        }
        List<C7056a> list = this.f30598E;
        if (list != null) {
            list.clear();
            this.f30598E = null;
        }
        if (this.f30605L != null) {
            this.f30605L = null;
        }
        C8321j.m45995a(this.f30606M);
        if (this.f30607N != null) {
            this.f30607N = null;
        }
        C6869c cVar = this.f30608O;
        if (cVar != null) {
            unregisterReceiver(cVar);
            this.f30608O = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C8340q.m46288b(this, new C7001s(this));
    }
}
