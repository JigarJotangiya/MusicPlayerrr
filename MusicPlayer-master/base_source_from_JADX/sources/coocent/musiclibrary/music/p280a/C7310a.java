package coocent.musiclibrary.music.p280a;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import coocent.musiclibrary.music.activity.AllLyricActivity;
import coocent.musiclibrary.music.localLyric.C7403a;
import coocent.musiclibrary.music.p284e.C7332e;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executors;
import p342g.p359b.C8350d;
import p342g.p359b.C8351e;
import p342g.p359b.C8353g;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: coocent.musiclibrary.music.a.a */
/* compiled from: AllLyricAdapter */
public class C7310a extends RecyclerView.C0797h<C7312b> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Activity f32281a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<String> f32282b;

    /* renamed from: c */
    private String f32283c;

    /* renamed from: d */
    private String f32284d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final String f32285e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final int f32286f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final int f32287g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final int f32288h;

    /* renamed from: i */
    public C7311a f32289i;

    /* renamed from: coocent.musiclibrary.music.a.a$a */
    /* compiled from: AllLyricAdapter */
    private final class C7311a extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        String f32290a;

        /* renamed from: b */
        String f32291b;

        public C7311a(String str, String str2) {
            this.f32290a = str;
            this.f32291b = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            try {
                File file = new File(this.f32291b);
                if (!file.exists()) {
                    Toast.makeText(C7310a.this.f32281a, "The lyric is not exists", 0).show();
                    return Boolean.FALSE;
                }
                String substring = file.getAbsolutePath().substring(file.getAbsolutePath().lastIndexOf(47) + 1);
                C7403a.m41751b(C7310a.this.f32281a, substring.replace(".lrc", BuildConfig.FLAVOR), this.f32291b, this.f32290a);
                return Boolean.TRUE;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (!isCancelled()) {
                C7310a.this.m41442o(false);
                try {
                    if (C7310a.this.f32281a != null) {
                        C7310a.this.f32281a.sendBroadcast(new Intent("coocent.musiclibrary.music.utils.LyricUtils_UPDATE_REPLACE_LYRIC"));
                        Toast.makeText(C7310a.this.f32281a, "Bind success!", 0).show();
                        if (C7310a.this.f32281a instanceof AllLyricActivity) {
                            C7310a.this.f32281a.finish();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            C7310a.this.m41442o(true);
        }
    }

    /* renamed from: coocent.musiclibrary.music.a.a$b */
    /* compiled from: AllLyricAdapter */
    public class C7312b extends RecyclerView.C0792c0 {

        /* renamed from: a */
        private final View f32293a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final TextView f32294b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final TextView f32295c;

        /* renamed from: coocent.musiclibrary.music.a.a$b$a */
        /* compiled from: AllLyricAdapter */
        class C7313a implements View.OnClickListener {
            C7313a(C7310a aVar) {
            }

            public void onClick(View view) {
                C7312b bVar = C7312b.this;
                bVar.m41453f(C7310a.this.f32285e);
            }
        }

        /* renamed from: coocent.musiclibrary.music.a.a$b$b */
        /* compiled from: AllLyricAdapter */
        class C7314b implements C7332e.C7334b {

            /* renamed from: a */
            final /* synthetic */ String f32298a;

            /* renamed from: b */
            final /* synthetic */ C7332e f32299b;

            C7314b(String str, C7332e eVar) {
                this.f32298a = str;
                this.f32299b = eVar;
            }

            /* renamed from: a */
            public void mo26720a() {
                this.f32299b.dismiss();
            }

            /* renamed from: b */
            public void mo26721b() {
                C7310a.this.mo28034k(this.f32298a, (String) C7310a.this.f32282b.get(C7312b.this.getAdapterPosition()));
                this.f32299b.dismiss();
            }

            /* renamed from: c */
            public void mo26722c() {
            }
        }

        public C7312b(View view) {
            super(view);
            this.f32293a = view;
            this.f32294b = (TextView) view.findViewById(C8350d.item_file_title);
            this.f32295c = (TextView) view.findViewById(C8350d.item_file_subtitle);
            view.setOnClickListener(new C7313a(C7310a.this));
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m41453f(String str) {
            C7332e eVar = new C7332e(C7310a.this.f32281a, C7310a.this.f32281a.getResources().getString(C8353g.bind_lyric), C7310a.this.f32281a.getResources().getString(C8353g.bind_lyric_tip), C7310a.this.f32286f, C7310a.this.f32287g, C7310a.this.f32288h, false);
            eVar.requestWindowFeature(1);
            eVar.show();
            eVar.mo28071c(new C7314b(str, eVar));
        }
    }

    public C7310a(Activity activity, List<String> list, String str, int i, int i2, int i3) {
        this.f32281a = activity;
        this.f32282b = list;
        this.f32285e = str;
        this.f32286f = i;
        this.f32287g = i2;
        this.f32288h = i3;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m41442o(boolean z) {
        ProgressBar progressBar;
        try {
            Activity activity = this.f32281a;
            if (activity != null && (activity instanceof AllLyricActivity) && (progressBar = ((AllLyricActivity) activity).f32303C) != null) {
                progressBar.setVisibility(z ? 0 : 8);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public void mo28033c(String str, String str2) {
        C7311a aVar = this.f32289i;
        if (aVar != null && aVar.getStatus() == AsyncTask.Status.RUNNING) {
            this.f32289i.cancel(true);
            this.f32289i = null;
        }
        C7311a aVar2 = new C7311a(str, str2);
        this.f32289i = aVar2;
        aVar2.executeOnExecutor(Executors.newCachedThreadPool(), new Void[0]);
    }

    public int getItemCount() {
        List<String> list = this.f32282b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: k */
    public void mo28034k(String str, String str2) {
        mo28033c(str, str2);
    }

    /* renamed from: l */
    public void mo28035l() {
        C7311a aVar = this.f32289i;
        if (aVar != null) {
            aVar.cancel(true);
            this.f32289i = null;
        }
    }

    /* renamed from: m */
    public void onBindViewHolder(C7312b bVar, int i) {
        File file = new File(this.f32282b.get(i));
        try {
            this.f32283c = file.getAbsolutePath().substring(file.getAbsolutePath().lastIndexOf(47) + 1);
        } catch (Exception unused) {
            this.f32283c = this.f32282b.get(i);
        }
        try {
            this.f32284d = file.getAbsolutePath().substring(0, file.getAbsolutePath().lastIndexOf(47) + 1);
        } catch (Exception unused2) {
            this.f32284d = BuildConfig.FLAVOR;
        }
        bVar.f32294b.setText(this.f32283c);
        bVar.f32295c.setText(this.f32284d);
    }

    /* renamed from: n */
    public C7312b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C7312b(LayoutInflater.from(viewGroup.getContext()).inflate(C8351e.item_file, viewGroup, false));
    }
}
