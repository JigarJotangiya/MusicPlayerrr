package coocent.musiclibrary.music.folder.p288ui;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import coocent.musiclibrary.music.folder.p288ui.DirectoryFragment;
import coocent.musiclibrary.music.p284e.C7332e;
import coocent.musiclibrary.music.p285f.p286b.C7347a;
import coocent.musiclibrary.music.p285f.p286b.C7349c;
import coocent.musiclibrary.music.p285f.p287c.C7353c;
import coocent.musiclibrary.music.p292j.C7397j;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.regex.Pattern;
import p342g.p359b.C8347a;
import p342g.p359b.C8350d;
import p342g.p359b.C8351e;
import p342g.p359b.C8353g;

/* renamed from: coocent.musiclibrary.music.folder.ui.FilePickerActivity */
public class FilePickerActivity extends AppCompatActivity implements DirectoryFragment.C7355b {

    /* renamed from: A */
    private ImageView f32404A;

    /* renamed from: B */
    private TextView f32405B;

    /* renamed from: C */
    private TextView f32406C;

    /* renamed from: D */
    private String f32407D;

    /* renamed from: E */
    private String f32408E;

    /* renamed from: F */
    private CharSequence f32409F;

    /* renamed from: G */
    private C7347a f32410G;

    /* renamed from: H */
    private int f32411H;

    /* renamed from: I */
    private int f32412I;

    /* renamed from: z */
    private ImageView f32413z;

    /* renamed from: coocent.musiclibrary.music.folder.ui.FilePickerActivity$a */
    class C7356a implements View.OnClickListener {
        C7356a() {
        }

        public void onClick(View view) {
            FilePickerActivity.this.onBackPressed();
        }
    }

    /* renamed from: coocent.musiclibrary.music.folder.ui.FilePickerActivity$b */
    class C7357b implements Runnable {

        /* renamed from: g */
        final /* synthetic */ File f32415g;

        C7357b(File file) {
            this.f32415g = file;
        }

        public void run() {
            FilePickerActivity.this.m41561h2(this.f32415g);
        }
    }

    /* renamed from: coocent.musiclibrary.music.folder.ui.FilePickerActivity$c */
    class C7358c implements C7332e.C7334b {

        /* renamed from: a */
        final /* synthetic */ String f32417a;

        /* renamed from: b */
        final /* synthetic */ C7332e f32418b;

        C7358c(String str, C7332e eVar) {
            this.f32417a = str;
            this.f32418b = eVar;
        }

        /* renamed from: a */
        public void mo26720a() {
            this.f32418b.dismiss();
        }

        /* renamed from: b */
        public void mo26721b() {
            FilePickerActivity.this.m41567n2(this.f32417a);
            this.f32418b.dismiss();
        }

        /* renamed from: c */
        public void mo26722c() {
        }
    }

    public FilePickerActivity() {
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        this.f32407D = absolutePath;
        this.f32408E = absolutePath;
    }

    /* renamed from: g2 */
    private void m41560g2(String str) {
        getFragmentManager().beginTransaction().replace(C8350d.container, DirectoryFragment.m41553c(str, this.f32410G)).addToBackStack((String) null).commit();
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public void m41561h2(File file) {
        if (file.isDirectory()) {
            String path = file.getPath();
            this.f32408E = path;
            if (path.equals("/storage/emulated")) {
                this.f32408E = Environment.getExternalStorageDirectory().getAbsolutePath();
            }
            m41560g2(this.f32408E);
            m41569p2();
        } else if (file.getPath().endsWith(".lrc")) {
            m41568o2(file.getPath());
        } else {
            Toast.makeText(this, "please select a lyric file!", 0).show();
        }
    }

    /* renamed from: i2 */
    private void m41562i2(Bundle bundle) {
        if (getIntent().hasExtra("arg_filter")) {
            Serializable serializableExtra = getIntent().getSerializableExtra("arg_filter");
            if (serializableExtra instanceof Pattern) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C7349c((Pattern) serializableExtra, false));
                this.f32410G = new C7347a(arrayList);
            } else {
                this.f32410G = (C7347a) serializableExtra;
            }
        }
        if (bundle != null) {
            this.f32407D = bundle.getString("state_start_path");
            this.f32408E = bundle.getString("state_current_path");
            m41569p2();
        } else {
            if (getIntent().hasExtra("arg_start_path")) {
                String stringExtra = getIntent().getStringExtra("arg_start_path");
                this.f32407D = stringExtra;
                this.f32408E = stringExtra;
            }
            if (getIntent().hasExtra("arg_current_path")) {
                String stringExtra2 = getIntent().getStringExtra("arg_current_path");
                if (stringExtra2.startsWith(this.f32407D)) {
                    this.f32408E = stringExtra2;
                }
            }
        }
        if (getIntent().hasExtra("arg_title")) {
            this.f32409F = getIntent().getCharSequenceExtra("arg_title");
        }
        if (getIntent().hasExtra("arg_closeable")) {
            getIntent().getBooleanExtra("arg_closeable", true);
        }
        if (getIntent().hasExtra("arg_accent_color")) {
            this.f32411H = getIntent().getIntExtra("arg_accent_color", -16777216);
        }
        if (getIntent().hasExtra("arg_default_color")) {
            this.f32412I = getIntent().getIntExtra("arg_default_color", -16777216);
        }
    }

    /* renamed from: j2 */
    private void m41563j2() {
        String str = this.f32408E;
        ArrayList arrayList = new ArrayList();
        while (!str.equals(this.f32407D)) {
            str = C7353c.m41549a(str);
            arrayList.add(str);
        }
        Collections.reverse(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m41560g2((String) it.next());
        }
    }

    /* renamed from: k2 */
    private void m41564k2() {
        getFragmentManager().beginTransaction().replace(C8350d.container, DirectoryFragment.m41553c(this.f32408E, this.f32410G)).addToBackStack((String) null).commit();
    }

    /* renamed from: l2 */
    private void m41565l2() {
        if (!TextUtils.isEmpty(this.f32409F)) {
            setTitle(this.f32409F);
        }
        m41569p2();
    }

    /* renamed from: m2 */
    private void m41566m2() {
        C7397j.m41734d(this);
        this.f32413z = (ImageView) findViewById(C8350d.backBtn);
        this.f32404A = (ImageView) findViewById(C8350d.lyricBtn);
        ImageView imageView = (ImageView) findViewById(C8350d.backgroud);
        TextView textView = (TextView) findViewById(C8350d.title);
        this.f32405B = textView;
        textView.setText("File Selection");
        this.f32406C = (TextView) findViewById(C8350d.subtitle);
        this.f32413z.setOnClickListener(new C7356a());
        this.f32404A.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public void m41567n2(String str) {
        Intent intent = new Intent();
        intent.putExtra("result_file_path", str);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: o2 */
    private void m41568o2(String str) {
        C7332e eVar = new C7332e(this, getResources().getString(C8353g.bind_lyric), getResources().getString(C8353g.bind_lyric_tip), this.f32411H, this.f32412I, getResources().getColor(C8347a.white), false);
        eVar.requestWindowFeature(1);
        eVar.show();
        eVar.mo28071c(new C7358c(str, eVar));
    }

    /* renamed from: p2 */
    private void m41569p2() {
        String str = this.f32408E.isEmpty() ? "/" : this.f32408E;
        if (TextUtils.isEmpty(this.f32409F)) {
            this.f32406C.setText(str);
        } else {
            this.f32406C.setText(str);
        }
    }

    public void onBackPressed() {
        FragmentManager fragmentManager = getFragmentManager();
        if (!this.f32408E.equals(this.f32407D)) {
            fragmentManager.popBackStack();
            this.f32408E = C7353c.m41549a(this.f32408E);
            m41569p2();
            return;
        }
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C8351e.activity_file_picker);
        m41562i2(bundle);
        m41566m2();
        m41565l2();
        m41563j2();
        m41564k2();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("state_current_path", this.f32408E);
        bundle.putString("state_start_path", this.f32407D);
    }

    /* renamed from: u */
    public void mo28112u(File file) {
        new Handler().postDelayed(new C7357b(file), 150);
    }
}
