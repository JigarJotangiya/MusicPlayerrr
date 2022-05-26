package coocent.musiclibrary.music.activity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coocent.musiclibrary.music.p280a.C7310a;
import coocent.musiclibrary.music.p282c.C7325a;
import coocent.musiclibrary.music.p285f.C7346a;
import coocent.musiclibrary.music.p292j.C7397j;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p342g.p359b.C8350d;
import p342g.p359b.C8351e;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class AllLyricActivity extends AppCompatActivity {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C7310a f32301A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public List<String> f32302B;

    /* renamed from: C */
    public ProgressBar f32303C;

    /* renamed from: D */
    private ImageView f32304D;

    /* renamed from: E */
    private ImageView f32305E;

    /* renamed from: F */
    private TextView f32306F;

    /* renamed from: G */
    private String f32307G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public String f32308H = BuildConfig.FLAVOR;

    /* renamed from: I */
    private int f32309I;

    /* renamed from: J */
    private int f32310J;

    /* renamed from: K */
    private int f32311K;

    /* renamed from: z */
    private RecyclerView f32312z;

    /* renamed from: coocent.musiclibrary.music.activity.AllLyricActivity$a */
    class C7315a implements View.OnClickListener {
        C7315a() {
        }

        public void onClick(View view) {
            AllLyricActivity.this.m41464l2();
        }
    }

    /* renamed from: coocent.musiclibrary.music.activity.AllLyricActivity$b */
    class C7316b implements View.OnClickListener {
        C7316b() {
        }

        public void onClick(View view) {
            AllLyricActivity.this.onBackPressed();
        }
    }

    /* renamed from: coocent.musiclibrary.music.activity.AllLyricActivity$c */
    class C7317c extends AsyncTask<Void, Void, List<String>> {
        C7317c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<String> doInBackground(Void... voidArr) {
            SystemClock.sleep(500);
            AllLyricActivity allLyricActivity = AllLyricActivity.this;
            return C7325a.m41489a(allLyricActivity, new String[]{".lrc"}, allLyricActivity.f32308H);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(List<String> list) {
            super.onPostExecute(list);
            AllLyricActivity.this.f32303C.setVisibility(8);
            if (list != null && list.size() > 0) {
                AllLyricActivity.this.f32302B.clear();
                for (int i = 0; i < list.size(); i++) {
                    if (new File(list.get(i)).exists()) {
                        AllLyricActivity.this.f32302B.add(list.get(i));
                    }
                }
                AllLyricActivity.this.f32301A.notifyDataSetChanged();
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            AllLyricActivity.this.f32303C.setVisibility(0);
        }
    }

    /* renamed from: i2 */
    private void m41461i2() {
        new C7317c().execute(new Void[0]);
    }

    /* renamed from: j2 */
    private void m41462j2() {
        m41461i2();
    }

    /* renamed from: k2 */
    private void m41463k2() {
        this.f32303C = (ProgressBar) findViewById(C8350d.progress);
        TextView textView = (TextView) findViewById(C8350d.title);
        this.f32306F = textView;
        textView.setText("Lyrics Selection");
        this.f32305E = (ImageView) findViewById(C8350d.backBtn);
        this.f32304D = (ImageView) findViewById(C8350d.lyricBtn);
        RecyclerView recyclerView = (RecyclerView) findViewById(C8350d.musicList);
        this.f32312z = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("currentName")) {
            this.f32307G = intent.getStringExtra("currentName");
        }
        if (intent != null && intent.hasExtra("accentColor")) {
            this.f32309I = intent.getIntExtra("accentColor", -16777216);
        }
        if (intent != null && intent.hasExtra("defaultColor")) {
            this.f32310J = intent.getIntExtra("defaultColor", -16777216);
        }
        if (intent != null && intent.hasExtra("backgroundColor")) {
            this.f32311K = intent.getIntExtra("backgroundColor", -1);
        }
        if (intent != null && intent.hasExtra("path")) {
            this.f32308H = intent.getStringExtra("path");
        }
        ArrayList arrayList = new ArrayList();
        this.f32302B = arrayList;
        C7310a aVar = new C7310a(this, arrayList, this.f32307G, this.f32309I, this.f32310J, this.f32311K);
        this.f32301A = aVar;
        this.f32312z.setAdapter(aVar);
        ImageView imageView = (ImageView) findViewById(C8350d.backgroud);
        this.f32304D.setOnClickListener(new C7315a());
        this.f32305E.setOnClickListener(new C7316b());
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public void m41464l2() {
        C7346a aVar = new C7346a();
        aVar.mo28093e(this);
        aVar.mo28097i(1032);
        aVar.mo28095g(true);
        aVar.mo28096h(true);
        aVar.mo28098j("Sample title");
        aVar.mo28092d(this.f32309I);
        aVar.mo28094f(this.f32310J);
        aVar.mo28091c();
    }

    /* renamed from: m2 */
    private void m41465m2() {
        C7310a aVar = this.f32301A;
        if (aVar != null && aVar.f32289i != null) {
            aVar.mo28035l();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 1032 && i2 == -1 && (stringExtra = intent.getStringExtra("result_file_path")) != null) {
            Log.d("lyric", "path:" + stringExtra);
            if (this.f32301A != null && stringExtra.endsWith(".lrc")) {
                this.f32301A.mo28034k(this.f32307G, stringExtra);
                finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C7397j.m41734d(this);
        setContentView(C8351e.all_lyric);
        m41463k2();
        m41462j2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        m41465m2();
    }
}
