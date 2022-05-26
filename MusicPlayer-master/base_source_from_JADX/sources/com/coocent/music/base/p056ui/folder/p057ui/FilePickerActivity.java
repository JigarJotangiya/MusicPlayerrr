package com.coocent.music.base.p056ui.folder.p057ui;

import android.annotation.SuppressLint;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.C0133c;
import androidx.core.content.p003d.C0524f;
import com.coocent.music.base.p056ui.folder.p057ui.DirectoryFragment;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.regex.Pattern;
import p159f.p166c.p181e.p182a.p190b.C4447a;
import p159f.p166c.p181e.p182a.p190b.C4448b;
import p159f.p166c.p181e.p182a.p190b.C4449c;
import p159f.p166c.p181e.p182a.p190b.C4452f;
import p159f.p166c.p181e.p182a.p190b.p193j.p194b.C4465a;
import p159f.p166c.p181e.p182a.p190b.p193j.p194b.C4467c;
import p159f.p166c.p181e.p182a.p190b.p193j.p195c.C4471c;
import p159f.p166c.p181e.p182a.p190b.p197l.C4484g;

/* renamed from: com.coocent.music.base.ui.folder.ui.FilePickerActivity */
public class FilePickerActivity extends AppCompatActivity implements DirectoryFragment.C2363a {

    /* renamed from: A */
    private String f8281A;

    /* renamed from: B */
    private String f8282B;

    /* renamed from: C */
    private CharSequence f8283C;

    /* renamed from: D */
    private C4465a f8284D;

    /* renamed from: z */
    private TextView f8285z;

    /* renamed from: com.coocent.music.base.ui.folder.ui.FilePickerActivity$a */
    class C2364a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ File f8286g;

        C2364a(File file) {
            this.f8286g = file;
        }

        public void run() {
            FilePickerActivity.this.m11123g2(this.f8286g);
        }
    }

    public FilePickerActivity() {
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        this.f8281A = absolutePath;
        this.f8282B = absolutePath;
    }

    /* renamed from: e2 */
    private void m11122e2(String str) {
        getFragmentManager().beginTransaction().replace(C4448b.container, DirectoryFragment.m11115a(str, this.f8284D)).addToBackStack((String) null).commit();
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public void m11123g2(File file) {
        if (file.isDirectory()) {
            String path = file.getPath();
            this.f8282B = path;
            if (path.equals("/storage/emulated")) {
                this.f8282B = Environment.getExternalStorageDirectory().getAbsolutePath();
            }
            m11122e2(this.f8282B);
            m11135u2();
        } else if (file.getPath().endsWith(".lrc")) {
            m11134t2(file.getPath());
        } else {
            Toast.makeText(this, "please select a lyric file!", 0).show();
        }
    }

    /* renamed from: h2 */
    private void m11124h2(Bundle bundle) {
        if (getIntent().hasExtra("arg_filter")) {
            Serializable serializableExtra = getIntent().getSerializableExtra("arg_filter");
            if (serializableExtra instanceof Pattern) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C4467c((Pattern) serializableExtra, false));
                this.f8284D = new C4465a(arrayList);
            } else {
                this.f8284D = (C4465a) serializableExtra;
            }
        }
        if (bundle != null) {
            this.f8281A = bundle.getString("state_start_path");
            this.f8282B = bundle.getString("state_current_path");
            m11135u2();
        } else {
            if (getIntent().hasExtra("arg_start_path")) {
                String stringExtra = getIntent().getStringExtra("arg_start_path");
                this.f8281A = stringExtra;
                this.f8282B = stringExtra;
            }
            if (getIntent().hasExtra("arg_current_path")) {
                String stringExtra2 = getIntent().getStringExtra("arg_current_path");
                if (stringExtra2.startsWith(this.f8281A)) {
                    this.f8282B = stringExtra2;
                }
            }
        }
        if (getIntent().hasExtra("arg_title")) {
            this.f8283C = getIntent().getCharSequenceExtra("arg_title");
        }
    }

    /* renamed from: i2 */
    private void m11125i2() {
        String str = this.f8282B;
        ArrayList arrayList = new ArrayList();
        while (!str.equals(this.f8281A)) {
            str = C4471c.m19552a(str);
            arrayList.add(str);
        }
        Collections.reverse(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m11122e2((String) it.next());
        }
    }

    /* renamed from: j2 */
    private void m11126j2() {
        getFragmentManager().beginTransaction().replace(C4448b.container, DirectoryFragment.m11115a(this.f8282B, this.f8284D)).addToBackStack((String) null).commit();
    }

    /* renamed from: k2 */
    private void m11127k2() {
        if (!TextUtils.isEmpty(this.f8283C)) {
            setTitle(this.f8283C);
        }
        m11135u2();
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: l2 */
    private void m11128l2() {
        C4484g.m19687a(this);
        ((TextView) findViewById(C4448b.title)).setText(C4452f.file_selection);
        this.f8285z = (TextView) findViewById(C4448b.subtitle);
        ((ImageView) findViewById(C4448b.backBtn)).setOnClickListener(new C2367c(this));
        ((ImageView) findViewById(C4448b.lyricBtn)).setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public /* synthetic */ void mo9304n2(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public /* synthetic */ void mo9305p2(String str, DialogInterface dialogInterface, int i) {
        m11132r2(str);
        dialogInterface.dismiss();
    }

    /* renamed from: r2 */
    private void m11132r2(String str) {
        Intent intent = new Intent();
        intent.putExtra("result_file_path", str);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: s2 */
    private void m11133s2() {
        C4484g.m19687a(this);
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= 21) {
            window.setNavigationBarColor(C0524f.m3223d(getResources(), C4447a.art_work_navigation_bg_color, (Resources.Theme) null));
        }
    }

    /* renamed from: t2 */
    private void m11134t2(String str) {
        C0133c.C0134a aVar = new C0133c.C0134a(this);
        aVar.mo644o(C4452f.bind_lyric);
        aVar.mo636g(C4452f.bind_lyric_tip);
        aVar.mo641l(17039370, new C2369e(this, str));
        aVar.mo638i(17039360, C2368d.f8292g);
        aVar.mo630a().show();
    }

    /* renamed from: u2 */
    private void m11135u2() {
        String str = this.f8282B.isEmpty() ? "/" : this.f8282B;
        if (TextUtils.isEmpty(this.f8283C)) {
            this.f8285z.setText(str);
        } else {
            this.f8285z.setText(str);
        }
    }

    public void onBackPressed() {
        FragmentManager fragmentManager = getFragmentManager();
        if (!this.f8282B.equals(this.f8281A)) {
            fragmentManager.popBackStack();
            this.f8282B = C4471c.m19552a(this.f8282B);
            m11135u2();
            return;
        }
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m11133s2();
        setContentView(C4449c.activity_lyric_picker);
        m11124h2(bundle);
        m11128l2();
        m11127k2();
        m11125i2();
        m11126j2();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("state_current_path", this.f8282B);
        bundle.putString("state_start_path", this.f8281A);
    }

    /* renamed from: u */
    public void mo9303u(File file) {
        new Handler().postDelayed(new C2364a(file), 150);
    }
}
