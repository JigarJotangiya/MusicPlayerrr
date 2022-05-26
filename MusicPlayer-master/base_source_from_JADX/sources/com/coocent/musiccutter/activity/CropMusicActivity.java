package com.coocent.musiccutter.activity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.MediaStore;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.coocent.musiccutter.ringtone.C2438d;
import com.coocent.musiccutter.ringtone.C2445f;
import com.coocent.musiccutter.ringtone.C2447g;
import com.coocent.musiccutter.ringtone.MarkerView;
import com.coocent.musiccutter.ringtone.WaveformView;
import com.coocent.musiccutter.view.C2453a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Locale;
import p159f.p166c.p199f.C4487a;
import p159f.p166c.p199f.C4489c;
import p159f.p166c.p199f.C4490d;
import p159f.p166c.p199f.C4491e;
import p159f.p166c.p199f.C4492f;
import p159f.p166c.p199f.C4493g;
import p159f.p166c.p199f.p200h.C4494a;
import p159f.p166c.p199f.p200h.C4495b;
import p159f.p166c.p199f.p200h.C4497c;
import p159f.p166c.p199f.p200h.C4498d;
import p159f.p166c.p199f.p200h.C4500e;
import p159f.p166c.p199f.p200h.C4501f;
import p402l.p406b.p407a.C8942a;
import p402l.p406b.p407a.C8943b;
import p402l.p406b.p426c.C9123c;
import p402l.p406b.p426c.C9130j;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class CropMusicActivity extends AppCompatActivity implements MarkerView.C2426a, WaveformView.C2427a, View.OnClickListener {

    /* renamed from: T0 */
    private static int f8340T0;

    /* renamed from: U0 */
    private static int f8341U0;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public long f8342A;
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public Handler f8343A0 = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f8344B;
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public boolean f8345B0 = false;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public ProgressDialog f8346C;
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public double f8347C0;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C2438d f8348D;
    /* access modifiers changed from: private */

    /* renamed from: D0 */
    public double f8349D0;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public File f8350E;

    /* renamed from: E0 */
    private float f8351E0 = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public String f8352F;

    /* renamed from: F0 */
    private float f8353F0 = 0.0f;

    /* renamed from: G */
    private String f8354G;
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public int f8355G0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public String f8356H;
    /* access modifiers changed from: private */

    /* renamed from: H0 */
    public boolean f8357H0 = false;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public boolean f8358I;
    /* access modifiers changed from: private */

    /* renamed from: I0 */
    public long f8359I0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public WaveformView f8360J;
    /* access modifiers changed from: private */

    /* renamed from: J0 */
    public String f8361J0;

    /* renamed from: K */
    private MarkerView f8362K;

    /* renamed from: K0 */
    private AudioManager f8363K0;

    /* renamed from: L */
    private MarkerView f8364L;

    /* renamed from: L0 */
    Handler f8365L0 = new C2419t();

    /* renamed from: M */
    private TextView f8366M;

    /* renamed from: M0 */
    private View.OnClickListener f8367M0 = new C2420u();

    /* renamed from: N */
    private boolean f8368N;
    /* access modifiers changed from: private */

    /* renamed from: N0 */
    public boolean f8369N0 = false;

    /* renamed from: O */
    private String f8370O;

    /* renamed from: O0 */
    private AudioManager.OnAudioFocusChangeListener f8371O0 = new C2422w();

    /* renamed from: P */
    private ImageView f8372P;

    /* renamed from: P0 */
    private RelativeLayout f8373P0;

    /* renamed from: Q */
    private TextView f8374Q;

    /* renamed from: Q0 */
    private View f8375Q0;

    /* renamed from: R */
    private TextView f8376R;
    /* access modifiers changed from: private */

    /* renamed from: R0 */
    public Runnable f8377R0 = new C2400i();

    /* renamed from: S */
    private TextView f8378S;

    /* renamed from: S0 */
    private BroadcastReceiver f8379S0 = new C2417r();

    /* renamed from: T */
    private TextView f8380T;

    /* renamed from: U */
    private ImageView f8381U;

    /* renamed from: V */
    private LinearLayout f8382V;

    /* renamed from: W */
    private LinearLayout f8383W;

    /* renamed from: X */
    private LinearLayout f8384X;

    /* renamed from: Y */
    private TextView f8385Y;

    /* renamed from: Z */
    private TextView f8386Z;

    /* renamed from: a0 */
    private String f8387a0 = BuildConfig.FLAVOR;

    /* renamed from: b0 */
    private int f8388b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public int f8389c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public int f8390d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public int f8391e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public int f8392f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public int f8393g0;

    /* renamed from: h0 */
    private int f8394h0;

    /* renamed from: i0 */
    private int f8395i0;

    /* renamed from: j0 */
    private int f8396j0;

    /* renamed from: k0 */
    private int f8397k0;

    /* renamed from: l0 */
    private int f8398l0;

    /* renamed from: m0 */
    private boolean f8399m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public MediaPlayer f8400n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public boolean f8401o0;

    /* renamed from: p0 */
    private boolean f8402p0;

    /* renamed from: q0 */
    private float f8403q0;

    /* renamed from: r0 */
    private int f8404r0;

    /* renamed from: s0 */
    private int f8405s0;

    /* renamed from: t0 */
    private int f8406t0;

    /* renamed from: u0 */
    private float f8407u0;

    /* renamed from: v0 */
    private String f8408v0;

    /* renamed from: w0 */
    private String f8409w0;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public MediaScannerConnection f8410x0;

    /* renamed from: y0 */
    private String f8411y0;

    /* renamed from: z */
    private int f8412z;

    /* renamed from: z0 */
    int f8413z0 = -1;

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$a */
    class C2389a implements View.OnClickListener {
        C2389a() {
        }

        public void onClick(View view) {
            CropMusicActivity.this.m11251d2((RelativeLayout) view, 2);
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$a0 */
    static class C2390a0 implements MediaScannerConnection.MediaScannerConnectionClient {

        /* renamed from: a */
        private String f8415a;

        /* renamed from: b */
        private WeakReference<CropMusicActivity> f8416b;

        /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$a0$a */
        class C2391a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ CropMusicActivity f8417g;

            /* renamed from: h */
            final /* synthetic */ Uri f8418h;

            C2391a(C2390a0 a0Var, CropMusicActivity cropMusicActivity, Uri uri) {
                this.f8417g = cropMusicActivity;
                this.f8418h = uri;
            }

            public void run() {
                this.f8417g.m11276q3(this.f8418h);
            }
        }

        public C2390a0(CropMusicActivity cropMusicActivity, String str) {
            this.f8416b = new WeakReference<>(cropMusicActivity);
            this.f8415a = str;
        }

        public void onMediaScannerConnected() {
            CropMusicActivity cropMusicActivity = (CropMusicActivity) this.f8416b.get();
            if (cropMusicActivity != null) {
                cropMusicActivity.f8410x0.scanFile(this.f8415a, (String) null);
            }
        }

        public void onScanCompleted(String str, Uri uri) {
            CropMusicActivity cropMusicActivity = (CropMusicActivity) this.f8416b.get();
            if (cropMusicActivity != null && cropMusicActivity.f8343A0 != null) {
                cropMusicActivity.f8343A0.post(new C2391a(this, cropMusicActivity, uri));
                cropMusicActivity.f8410x0.disconnect();
                MediaScannerConnection unused = cropMusicActivity.f8410x0 = null;
            }
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$b */
    class C2392b implements View.OnClickListener {
        C2392b(CropMusicActivity cropMusicActivity) {
        }

        public void onClick(View view) {
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$c */
    class C2393c implements DialogInterface.OnShowListener {

        /* renamed from: g */
        final /* synthetic */ EditText f8419g;

        /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$c$a */
        class C2394a implements Runnable {
            C2394a() {
            }

            public void run() {
                C2393c.this.f8419g.requestFocus();
                ((InputMethodManager) CropMusicActivity.this.getSystemService("input_method")).showSoftInput(C2393c.this.f8419g, 1);
            }
        }

        C2393c(EditText editText) {
            this.f8419g = editText;
        }

        public void onShow(DialogInterface dialogInterface) {
            EditText editText = this.f8419g;
            if (editText != null) {
                editText.postDelayed(new C2394a(), 200);
            }
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$d */
    class C2395d implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ AlertDialog f8422g;

        C2395d(CropMusicActivity cropMusicActivity, AlertDialog alertDialog) {
            this.f8422g = alertDialog;
        }

        public void onClick(View view) {
            this.f8422g.dismiss();
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$e */
    class C2396e implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ EditText f8423g;

        /* renamed from: h */
        final /* synthetic */ AlertDialog f8424h;

        C2396e(EditText editText, AlertDialog alertDialog) {
            this.f8423g = editText;
            this.f8424h = alertDialog;
        }

        public void onClick(View view) {
            CropMusicActivity.this.m11258h3(this.f8423g);
            this.f8424h.dismiss();
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$f */
    class C2397f implements DialogInterface.OnClickListener {
        C2397f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS", Uri.parse("package:" + CropMusicActivity.this.getPackageName()));
            intent.addFlags(268435456);
            CropMusicActivity.this.startActivityForResult(intent, 101);
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$g */
    class C2398g implements DialogInterface.OnClickListener {
        C2398g(CropMusicActivity cropMusicActivity) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$h */
    class C2399h implements DialogInterface.OnClickListener {
        C2399h() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            CropMusicActivity.this.setResult(0);
            CropMusicActivity.this.finish();
            CropMusicActivity.this.overridePendingTransition(C4487a.slide_left_in, C4487a.slide_right_out);
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$i */
    class C2400i implements Runnable {
        C2400i() {
        }

        public void run() {
            try {
                if (CropMusicActivity.this.f8390d0 != CropMusicActivity.this.f8392f0) {
                    CropMusicActivity cropMusicActivity = CropMusicActivity.this;
                    int unused = cropMusicActivity.f8392f0 = cropMusicActivity.f8390d0;
                }
                if (CropMusicActivity.this.f8391e0 != CropMusicActivity.this.f8393g0) {
                    CropMusicActivity cropMusicActivity2 = CropMusicActivity.this;
                    int unused2 = cropMusicActivity2.f8393g0 = cropMusicActivity2.f8391e0;
                }
                if (CropMusicActivity.this.f8343A0 != null) {
                    CropMusicActivity.this.f8343A0.postDelayed(CropMusicActivity.this.f8377R0, 100);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$j */
    class C2401j implements DialogInterface.OnCancelListener {
        C2401j() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            boolean unused = CropMusicActivity.this.f8344B = false;
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$k */
    class C2402k implements C2453a.C2456c {
        C2402k() {
        }

        /* renamed from: a */
        public void mo9403a(double d) {
            double unused = CropMusicActivity.this.f8347C0 = d;
            if (CropMusicActivity.this.f8360J != null && CropMusicActivity.this.f8360J.mo9438f()) {
                CropMusicActivity cropMusicActivity = CropMusicActivity.this;
                int unused2 = cropMusicActivity.f8390d0 = cropMusicActivity.f8360J.mo9449m(CropMusicActivity.this.f8347C0);
            }
            if (CropMusicActivity.this.f8390d0 > CropMusicActivity.this.f8391e0) {
                CropMusicActivity cropMusicActivity2 = CropMusicActivity.this;
                int unused3 = cropMusicActivity2.f8390d0 = cropMusicActivity2.f8391e0;
                CropMusicActivity cropMusicActivity3 = CropMusicActivity.this;
                double unused4 = cropMusicActivity3.f8347C0 = cropMusicActivity3.m11268m3(cropMusicActivity3.f8390d0);
            }
            CropMusicActivity.this.m11236O3(true);
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$l */
    class C2403l implements C2438d.C2440b {
        C2403l() {
        }

        /* renamed from: a */
        public boolean mo9404a(double d) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - CropMusicActivity.this.f8342A > 100) {
                CropMusicActivity.this.f8346C.setProgress((int) (((double) CropMusicActivity.this.f8346C.getMax()) * d));
                long unused = CropMusicActivity.this.f8342A = currentTimeMillis;
            }
            return CropMusicActivity.this.f8344B;
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$m */
    class C2404m extends Thread {
        C2404m() {
        }

        public void run() {
            try {
                CropMusicActivity cropMusicActivity = CropMusicActivity.this;
                boolean unused = cropMusicActivity.f8401o0 = C2445f.m11463a(cropMusicActivity.getPreferences(0));
                MediaPlayer unused2 = CropMusicActivity.this.f8400n0 = new MediaPlayer();
                if (CropMusicActivity.this.f8359I0 == -1 || CropMusicActivity.this.f8358I) {
                    CropMusicActivity.this.f8400n0.setDataSource(CropMusicActivity.this.f8352F);
                } else {
                    MediaPlayer l2 = CropMusicActivity.this.f8400n0;
                    CropMusicActivity cropMusicActivity2 = CropMusicActivity.this;
                    l2.setDataSource(cropMusicActivity2, ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, cropMusicActivity2.f8359I0));
                }
                CropMusicActivity.this.f8400n0.setAudioStreamType(3);
                CropMusicActivity.this.f8400n0.prepare();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$n */
    class C2405n extends Thread {

        /* renamed from: g */
        final /* synthetic */ C2438d.C2440b f8433g;

        /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$n$a */
        class C2406a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ String f8435g;

            C2406a(String str) {
                this.f8435g = str;
            }

            public void run() {
                CropMusicActivity cropMusicActivity = CropMusicActivity.this;
                cropMusicActivity.m11272o3(cropMusicActivity.getResources().getString(C4492f.unsupportedExtension), this.f8435g, new Exception());
            }
        }

        /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$n$b */
        class C2407b implements Runnable {

            /* renamed from: g */
            final /* synthetic */ Exception f8437g;

            C2407b(Exception exc) {
                this.f8437g = exc;
            }

            public void run() {
                CropMusicActivity cropMusicActivity = CropMusicActivity.this;
                cropMusicActivity.m11272o3(cropMusicActivity.getResources().getString(C4492f.ReadError), CropMusicActivity.this.getResources().getString(C4492f.read_error), this.f8437g);
            }
        }

        /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$n$c */
        class C2408c implements Runnable {
            C2408c() {
            }

            public void run() {
                CropMusicActivity.this.m11262j3();
            }
        }

        C2405n(C2438d.C2440b bVar) {
            this.f8433g = bVar;
        }

        public void run() {
            String str;
            try {
                CropMusicActivity cropMusicActivity = CropMusicActivity.this;
                C2438d unused = cropMusicActivity.f8348D = C2438d.m11418d(cropMusicActivity.getApplication(), CropMusicActivity.this.f8350E.getAbsolutePath(), CropMusicActivity.this.f8359I0, this.f8433g);
                if (CropMusicActivity.this.f8348D == null || CropMusicActivity.this.f8348D.mo9492r()) {
                    CropMusicActivity.this.f8346C.dismiss();
                    String[] split = CropMusicActivity.this.f8350E.getName().toLowerCase().split("\\.");
                    if (split.length < 2) {
                        str = CropMusicActivity.this.getResources().getString(C4492f.no_extension_error);
                    } else {
                        str = CropMusicActivity.this.getResources().getString(C4492f.bad_extension_error) + " " + split[split.length - 1];
                    }
                    C2406a aVar = new C2406a(str);
                    if (CropMusicActivity.this.f8343A0 != null) {
                        CropMusicActivity.this.f8343A0.post(aVar);
                        return;
                    }
                    return;
                }
                CropMusicActivity.this.f8346C.dismiss();
                if (CropMusicActivity.this.f8344B) {
                    C2408c cVar = new C2408c();
                    if (CropMusicActivity.this.f8343A0 != null) {
                        CropMusicActivity.this.f8343A0.post(cVar);
                        return;
                    }
                    return;
                }
                CropMusicActivity.this.setResult(0);
                CropMusicActivity.this.finish();
                CropMusicActivity.this.overridePendingTransition(C4487a.slide_left_in, C4487a.slide_right_out);
            } catch (Exception e) {
                try {
                    CropMusicActivity.this.f8346C.dismiss();
                    e.printStackTrace();
                    C2407b bVar = new C2407b(e);
                    if (CropMusicActivity.this.f8343A0 != null) {
                        CropMusicActivity.this.f8343A0.post(bVar);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$o */
    class C2409o extends Thread {

        /* renamed from: g */
        final /* synthetic */ CharSequence f8440g;

        /* renamed from: h */
        final /* synthetic */ int f8441h;

        /* renamed from: i */
        final /* synthetic */ int f8442i;

        /* renamed from: j */
        final /* synthetic */ int f8443j;

        /* renamed from: k */
        final /* synthetic */ File f8444k;

        /* renamed from: l */
        final /* synthetic */ String f8445l;

        /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$o$a */
        class C2410a implements C2438d.C2441c {

            /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$o$a$a */
            class C2411a implements Runnable {

                /* renamed from: g */
                final /* synthetic */ String f8448g;

                C2411a(String str) {
                    this.f8448g = str;
                }

                public void run() {
                    boolean unused = CropMusicActivity.this.f8345B0 = true;
                    C2409o oVar = C2409o.this;
                    CropMusicActivity.this.m11252d3(oVar.f8440g, this.f8448g, oVar.f8444k, oVar.f8441h);
                    CropMusicActivity.this.onBackPressed();
                }
            }

            /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$o$a$b */
            class C2412b implements Runnable {
                C2412b() {
                }

                public void run() {
                    CropMusicActivity cropMusicActivity = CropMusicActivity.this;
                    Resources resources = cropMusicActivity.getResources();
                    int i = C4492f.write_error;
                    cropMusicActivity.m11272o3(resources.getString(i), CropMusicActivity.this.getResources().getString(i), new Exception());
                }
            }

            C2410a() {
            }

            /* renamed from: a */
            public void mo9411a() {
                String unused = CropMusicActivity.this.f8361J0 = null;
                CropMusicActivity.this.f8346C.dismiss();
                C2412b bVar = new C2412b();
                if (CropMusicActivity.this.f8343A0 != null) {
                    CropMusicActivity.this.f8343A0.post(bVar);
                }
            }

            /* renamed from: b */
            public void mo9412b(String str) {
                String unused = CropMusicActivity.this.f8361J0 = str;
                C2411a aVar = new C2411a(str);
                if (CropMusicActivity.this.f8343A0 != null) {
                    CropMusicActivity.this.f8343A0.post(aVar);
                }
            }
        }

        /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$o$b */
        class C2413b implements Runnable {
            C2413b() {
            }

            public void run() {
                boolean unused = CropMusicActivity.this.f8345B0 = true;
                C2409o oVar = C2409o.this;
                CropMusicActivity.this.m11252d3(oVar.f8440g, oVar.f8445l, oVar.f8444k, oVar.f8441h);
                CropMusicActivity.this.onBackPressed();
            }
        }

        /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$o$c */
        class C2414c implements Runnable {

            /* renamed from: g */
            final /* synthetic */ CharSequence f8452g;

            /* renamed from: h */
            final /* synthetic */ Exception f8453h;

            C2414c(CharSequence charSequence, Exception exc) {
                this.f8452g = charSequence;
                this.f8453h = exc;
            }

            public void run() {
                CropMusicActivity cropMusicActivity = CropMusicActivity.this;
                cropMusicActivity.m11272o3(cropMusicActivity.getResources().getString(C4492f.write_error), this.f8452g, this.f8453h);
            }
        }

        C2409o(CharSequence charSequence, int i, int i2, int i3, File file, String str) {
            this.f8440g = charSequence;
            this.f8441h = i;
            this.f8442i = i2;
            this.f8443j = i3;
            this.f8444k = file;
            this.f8445l = str;
        }

        public void run() {
            Exception exc;
            String str;
            try {
                if (Build.VERSION.SDK_INT < 29 || CropMusicActivity.this.f8358I) {
                    C2438d I2 = CropMusicActivity.this.f8348D;
                    File file = this.f8444k;
                    int i = this.f8442i;
                    I2.mo9468b(file, i, this.f8443j - i);
                    C2413b bVar = new C2413b();
                    if (CropMusicActivity.this.f8343A0 != null) {
                        CropMusicActivity.this.f8343A0.post(bVar);
                        return;
                    }
                    return;
                }
                C2438d I22 = CropMusicActivity.this.f8348D;
                CharSequence charSequence = this.f8440g;
                String P2 = CropMusicActivity.this.f8356H;
                long F2 = CropMusicActivity.this.f8359I0;
                int i2 = this.f8441h;
                int i3 = this.f8442i;
                I22.mo9469c(charSequence, P2, F2, i2, i3, this.f8443j - i3, new C2410a());
            } catch (Exception e) {
                try {
                    CropMusicActivity.this.f8346C.dismiss();
                    if (e.getMessage().equals("No space left on device")) {
                        str = CropMusicActivity.this.getResources().getString(C4492f.no_space_error);
                        exc = null;
                    } else {
                        exc = e;
                        str = CropMusicActivity.this.getResources().getString(C4492f.write_error);
                    }
                    C2414c cVar = new C2414c(str, exc);
                    if (CropMusicActivity.this.f8343A0 != null) {
                        CropMusicActivity.this.f8343A0.post(cVar);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$p */
    class C2415p implements Runnable {

        /* renamed from: g */
        final /* synthetic */ String f8455g;

        C2415p(String str) {
            this.f8455g = str;
        }

        public void run() {
            boolean unused = CropMusicActivity.this.f8345B0 = true;
            CropMusicActivity.this.m11276q3(Uri.parse(this.f8455g));
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$q */
    class C2416q implements Runnable {
        C2416q() {
        }

        public void run() {
            CropMusicActivity.this.m11236O3(true);
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$r */
    class C2417r extends BroadcastReceiver {
        C2417r() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("MusicCutter.CUTTER_PAUSE_ACTION".equals(intent.getAction())) {
                CropMusicActivity.this.m11274p3();
            }
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$s */
    class C2418s implements C2453a.C2456c {
        C2418s() {
        }

        /* renamed from: a */
        public void mo9403a(double d) {
            double unused = CropMusicActivity.this.f8349D0 = d;
            if (CropMusicActivity.this.f8360J != null && CropMusicActivity.this.f8360J.mo9438f()) {
                CropMusicActivity cropMusicActivity = CropMusicActivity.this;
                int unused2 = cropMusicActivity.f8391e0 = cropMusicActivity.f8360J.mo9449m(CropMusicActivity.this.f8349D0);
            }
            if (CropMusicActivity.this.f8391e0 > CropMusicActivity.this.f8389c0) {
                CropMusicActivity cropMusicActivity2 = CropMusicActivity.this;
                int unused3 = cropMusicActivity2.f8391e0 = cropMusicActivity2.f8389c0;
                CropMusicActivity cropMusicActivity3 = CropMusicActivity.this;
                double unused4 = cropMusicActivity3.f8349D0 = cropMusicActivity3.m11268m3(cropMusicActivity3.f8391e0);
            }
            if (CropMusicActivity.this.f8391e0 < CropMusicActivity.this.f8390d0) {
                CropMusicActivity cropMusicActivity4 = CropMusicActivity.this;
                int unused5 = cropMusicActivity4.f8391e0 = cropMusicActivity4.f8390d0;
                CropMusicActivity cropMusicActivity5 = CropMusicActivity.this;
                double unused6 = cropMusicActivity5.f8349D0 = cropMusicActivity5.m11268m3(cropMusicActivity5.f8391e0);
            }
            CropMusicActivity.this.m11236O3(true);
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$t */
    class C2419t extends Handler {
        C2419t() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1001) {
                int unused = CropMusicActivity.this.f8355G0 = 2;
                boolean unused2 = CropMusicActivity.this.f8357H0 = false;
            }
            super.handleMessage(message);
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$u */
    class C2420u implements View.OnClickListener {
        C2420u() {
        }

        public void onClick(View view) {
            CropMusicActivity cropMusicActivity = CropMusicActivity.this;
            cropMusicActivity.m11292y3(cropMusicActivity.f8390d0);
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$v */
    class C2421v implements MediaPlayer.OnCompletionListener {
        C2421v() {
        }

        public synchronized void onCompletion(MediaPlayer mediaPlayer) {
            CropMusicActivity.this.m11274p3();
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$w */
    class C2422w implements AudioManager.OnAudioFocusChangeListener {
        C2422w() {
        }

        public void onAudioFocusChange(int i) {
            if (CropMusicActivity.this.f8400n0 != null) {
                if (i == -3) {
                    if (CropMusicActivity.this.f8400n0.isPlaying()) {
                        boolean unused = CropMusicActivity.this.f8369N0 = true;
                    } else {
                        boolean unused2 = CropMusicActivity.this.f8369N0 = false;
                    }
                    CropMusicActivity.this.f8400n0.setVolume(0.2f, 0.2f);
                } else if (i != -2) {
                    if (i != -1) {
                        if (i == 1) {
                            CropMusicActivity.this.f8400n0.setVolume(1.0f, 1.0f);
                            if (!CropMusicActivity.this.f8400n0.isPlaying() && CropMusicActivity.this.f8369N0) {
                                CropMusicActivity cropMusicActivity = CropMusicActivity.this;
                                cropMusicActivity.m11292y3(cropMusicActivity.f8390d0);
                                boolean unused3 = CropMusicActivity.this.f8369N0 = false;
                            }
                        }
                    } else if (CropMusicActivity.this.f8400n0.isPlaying()) {
                        boolean unused4 = CropMusicActivity.this.f8369N0 = true;
                        CropMusicActivity.this.m11274p3();
                    } else {
                        boolean unused5 = CropMusicActivity.this.f8369N0 = false;
                    }
                } else if (CropMusicActivity.this.f8400n0.isPlaying()) {
                    boolean unused6 = CropMusicActivity.this.f8369N0 = true;
                    CropMusicActivity.this.m11274p3();
                }
            }
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$x */
    class C2423x implements TextWatcher {

        /* renamed from: g */
        final /* synthetic */ EditText f8464g;

        C2423x(EditText editText) {
            this.f8464g = editText;
        }

        public void afterTextChanged(Editable editable) {
            if (!TextUtils.isEmpty(editable)) {
                C4501f.m19720e(CropMusicActivity.this.getApplicationContext(), this.f8464g, true);
            } else {
                C4501f.m19720e(CropMusicActivity.this.getApplicationContext(), this.f8464g, false);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$y */
    class C2424y implements View.OnClickListener {
        C2424y() {
        }

        public void onClick(View view) {
            CropMusicActivity.this.m11251d2((RelativeLayout) view, 0);
        }
    }

    /* renamed from: com.coocent.musiccutter.activity.CropMusicActivity$z */
    class C2425z implements View.OnClickListener {
        C2425z() {
        }

        public void onClick(View view) {
            CropMusicActivity.this.m11251d2((RelativeLayout) view, 1);
        }
    }

    /* renamed from: A3 */
    private void m11209A3() {
        AudioManager audioManager = this.f8363K0;
        if (audioManager != null) {
            audioManager.requestAudioFocus(this.f8371O0, 3, 1);
        }
    }

    /* renamed from: B3 */
    private void m11211B3() {
        this.f8390d0 = this.f8360J.mo9449m(0.0d);
        int m = this.f8360J.mo9449m(15.0d);
        this.f8391e0 = m;
        int i = this.f8389c0;
        if (m > i) {
            this.f8391e0 = i;
        }
        Log.d("onTextChanged: ===", this.f8390d0 + "==" + this.f8391e0);
        this.f8347C0 = m11268m3(this.f8390d0);
        this.f8349D0 = m11268m3(this.f8391e0);
    }

    /* renamed from: D3 */
    private void m11214D3(CharSequence charSequence) {
        String str;
        File file;
        if (charSequence != null) {
            if (Build.VERSION.SDK_INT < 29 || this.f8358I) {
                String str2 = m11270n3() + File.separator + charSequence.toString() + this.f8356H;
                File file2 = new File(str2);
                if (file2.exists()) {
                    Toast.makeText(getApplicationContext(), C4492f.crop_title_repeat, 0).show();
                    return;
                } else {
                    file = file2;
                    str = str2;
                }
            } else if (C4495b.m19703b(this, charSequence.toString().trim())) {
                Toast.makeText(getApplicationContext(), C4492f.crop_title_repeat, 0).show();
                return;
            } else {
                file = null;
                str = null;
            }
            double j = this.f8360J.mo9446j(this.f8390d0);
            Log.e("time", "startTime:" + j);
            double j2 = this.f8360J.mo9446j(this.f8391e0);
            Log.e("time", "endTime:" + j2);
            int l = this.f8360J.mo9448l(j);
            Log.e("time", "startFrame:" + l);
            int l2 = this.f8360J.mo9448l(j2);
            Log.e("time", "endFrame:" + l2);
            int i = ((int) ((j2 - j) + 0.5d)) * 1000;
            Log.e("time", "duration:" + i);
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.f8346C = progressDialog;
            progressDialog.setProgressStyle(0);
            this.f8346C.setTitle(getResources().getString(C4492f.crop_saving));
            this.f8346C.setIndeterminate(true);
            this.f8346C.setCancelable(false);
            this.f8346C.show();
            new C2409o(charSequence, i, l, l2, file, str).start();
        }
    }

    /* renamed from: E3 */
    private void m11216E3(boolean z) {
        if (!this.f8399m0) {
            Toast.makeText(this, getString(C4492f.play_click), 1).show();
            return;
        }
        int h = this.f8360J.mo9444h(this.f8400n0.getCurrentPosition() + this.f8397k0);
        if (z) {
            if (h < this.f8391e0) {
                this.f8390d0 = h;
                m11226J3();
                this.f8347C0 = m11268m3(h);
                Log.d("setCurrentPos: ", this.f8347C0 + "==" + this.f8390d0);
                this.f8360J.setLineStart(true);
                this.f8362K.requestFocus();
            } else {
                Toast.makeText(this, getString(C4492f.greater_start), 1).show();
            }
        } else if (h > this.f8390d0) {
            this.f8391e0 = h;
            m11220G3();
            this.f8349D0 = m11268m3(h);
            if (this.f8399m0) {
                m11274p3();
            }
            this.f8360J.setLineStart(false);
            this.f8364L.requestFocus();
        } else {
            Toast.makeText(this, getString(C4492f.less_start), 1).show();
        }
        m11236O3(true);
    }

    /* renamed from: F3 */
    private void m11218F3(int i) {
        m11224I3(i);
        m11236O3(true);
    }

    /* renamed from: G3 */
    private void m11220G3() {
        m11218F3(this.f8391e0 - (this.f8388b0 / 2));
    }

    /* renamed from: H3 */
    private void m11222H3() {
        m11224I3(this.f8391e0 - (this.f8388b0 / 2));
    }

    /* renamed from: I3 */
    private void m11224I3(int i) {
        if (!this.f8402p0) {
            this.f8395i0 = i;
            int i2 = this.f8388b0;
            int i3 = i + (i2 / 2);
            int i4 = this.f8389c0;
            if (i3 > i4) {
                this.f8395i0 = i4 - (i2 / 2);
            }
            if (this.f8395i0 < 0) {
                this.f8395i0 = 0;
            }
        }
    }

    /* renamed from: J3 */
    private void m11226J3() {
        m11218F3(this.f8390d0 - (this.f8388b0 / 2));
    }

    /* renamed from: K3 */
    private void m11228K3() {
        m11224I3(this.f8390d0 - (this.f8388b0 / 2));
    }

    /* renamed from: L3 */
    private void m11230L3(Exception exc, CharSequence charSequence) {
        String str;
        if (exc != null) {
            str = getResources().getString(C4492f.fail);
            setResult(0, new Intent());
        } else {
            str = getResources().getString(C4492f.success);
        }
        new AlertDialog.Builder(this).setTitle(str).setMessage(charSequence).setPositiveButton(getResources().getString(C4492f.main_ok), new C2399h()).setCancelable(false).show();
    }

    /* renamed from: M3 */
    private int m11232M3(int i) {
        if (i < 0) {
            return 0;
        }
        int i2 = this.f8389c0;
        return i > i2 ? i2 : i;
    }

    /* renamed from: N3 */
    private double m11234N3(double d) {
        if (d < 0.0d) {
            return 0.0d;
        }
        double e3 = mo9374e3(Double.valueOf(this.f8360J.mo9446j(this.f8389c0)));
        if (d > e3) {
            return e3;
        }
        return mo9374e3(Double.valueOf(d));
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public synchronized void m11236O3(boolean z) {
        int i;
        if (this.f8399m0) {
            int currentPosition = this.f8400n0.getCurrentPosition() + this.f8397k0;
            int h = this.f8360J.mo9444h(currentPosition);
            this.f8360J.setPlayback(h);
            m11224I3(h - (this.f8388b0 / 2));
            if (currentPosition >= this.f8398l0) {
                m11274p3();
            }
        }
        if (!this.f8402p0 && this.f8399m0 && ((i = this.f8355G0) == 0 || i == 2)) {
            if (i == 0) {
                this.f8355G0 = 1;
            }
            int i2 = this.f8355G0;
            if (i2 == 1 && !this.f8357H0) {
                this.f8357H0 = true;
                this.f8365L0.removeCallbacksAndMessages((Object) null);
                this.f8365L0.sendEmptyMessageDelayed(1001, 5000);
            } else if (i2 == 2) {
                m11286v3();
            }
        }
        if (f8341U0 == 0) {
            f8340T0 = 0;
            f8341U0 = this.f8362K.getWidth();
        }
        this.f8360J.mo9450n(this.f8390d0, this.f8391e0, this.f8394h0, this.f8362K.getWidth() / 2);
        if (m11282t3(z)) {
            this.f8360J.invalidate();
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.width = C4497c.m19710a(this, 20.0f);
        layoutParams.height = C4497c.m19710a(this, 20.0f);
        int i3 = (this.f8390d0 - this.f8394h0) - f8340T0;
        if (this.f8362K.getWidth() + i3 >= 0) {
            this.f8362K.setAlpha(255);
        } else {
            this.f8362K.setAlpha(0);
            i3 = 0;
        }
        layoutParams.setMargins(i3 + C4497c.m19710a(this, 1.0f), 0, 0, 0);
        this.f8362K.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.width = C4497c.m19710a(this, 20.0f);
        layoutParams2.height = C4497c.m19710a(this, 20.0f);
        int width = ((this.f8391e0 - this.f8394h0) - this.f8364L.getWidth()) + f8341U0;
        if (this.f8364L.getWidth() + width >= 0) {
            this.f8364L.setAlpha(255);
        } else {
            this.f8364L.setAlpha(0);
            width = 0;
        }
        layoutParams2.setMargins((this.f8364L.getWidth() + width) - C4497c.m19710a(this, 1.0f), 0, width > 630 ? -(width - 630) : 0, 0);
        this.f8364L.setLayoutParams(layoutParams2);
        if (z) {
            this.f8385Y.setText(C4494a.m19693b(this.f8347C0));
            this.f8386Z.setText(C4494a.m19693b(this.f8349D0));
            this.f8376R.setText(C4494a.m19693b(this.f8347C0));
            this.f8380T.setText(C4494a.m19693b(this.f8349D0));
            this.f8378S.setText(C4494a.m19693b(this.f8349D0 - this.f8347C0));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public void m11251d2(RelativeLayout relativeLayout, int i) {
        m11290x3(relativeLayout, !(this.f8413z0 == i));
        if (this.f8413z0 == i) {
            this.f8373P0 = null;
            this.f8413z0 = -1;
            return;
        }
        m11290x3(this.f8373P0, false);
        this.f8373P0 = relativeLayout;
        this.f8413z0 = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public void m11252d3(CharSequence charSequence, String str, File file, int i) {
        Handler handler;
        String string = getString(C4492f.artist_name);
        if (!TextUtils.isEmpty(str)) {
            if (Build.VERSION.SDK_INT < 29 || this.f8358I) {
                try {
                    File file2 = new File(str);
                    if (file2.exists()) {
                        C8942a d = C8943b.m47887d(file2);
                        C9130j i2 = d.mo31271i();
                        i2.mo31521e(C9123c.ARTIST, string);
                        i2.mo31521e(C9123c.ALBUM, "RingToneCutter");
                        i2.mo31521e(C9123c.TITLE, charSequence.toString());
                        C8943b.m47888f(d);
                    }
                } catch (Exception unused) {
                }
                MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(getApplicationContext(), new C2390a0(this, str));
                this.f8410x0 = mediaScannerConnection;
                mediaScannerConnection.connect();
                this.f8345B0 = true;
            } else if (str.startsWith("content:") && (handler = this.f8343A0) != null) {
                handler.post(new C2415p(str));
            }
        }
    }

    /* renamed from: e2 */
    private void m11253e2() {
        AudioManager audioManager = this.f8363K0;
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.f8371O0);
        }
    }

    /* renamed from: f3 */
    private void m11254f3(boolean z) {
        boolean z2 = this.f8390d0 == this.f8391e0;
        double d = -0.1d;
        if (!z2) {
            m11234N3(this.f8349D0 + (z ? 0.1d : -0.1d));
        } else if (z) {
            m11234N3(this.f8349D0 + 0.1d);
        }
        double d2 = this.f8349D0;
        if (z2 || z) {
            d = 0.1d;
        }
        double N3 = m11234N3(d2 + d);
        this.f8349D0 = N3;
        int m = this.f8360J.mo9449m(N3);
        this.f8391e0 = m;
        int i = this.f8389c0;
        if (m > i) {
            this.f8391e0 = i;
        }
        int i2 = this.f8391e0;
        int i3 = this.f8390d0;
        if (i2 < i3) {
            this.f8391e0 = i3;
        }
        m11220G3();
        m11236O3(true);
    }

    /* renamed from: g3 */
    private void m11256g3(boolean z) {
        boolean z2 = this.f8390d0 == this.f8391e0;
        double N3 = m11234N3(this.f8347C0 + (z ? 0.1d : -0.1d));
        this.f8347C0 = N3;
        int m = this.f8360J.mo9449m(N3);
        this.f8390d0 = m;
        if (m < 0) {
            this.f8390d0 = 0;
        }
        if (z2) {
            int i = this.f8390d0;
            int i2 = this.f8389c0;
            if (i > i2) {
                this.f8390d0 = i2;
            }
            this.f8391e0 = this.f8390d0;
        } else {
            int i3 = this.f8390d0;
            int i4 = this.f8391e0;
            if (i3 > i4) {
                this.f8390d0 = i4;
            }
        }
        m11226J3();
        m11236O3(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public void m11258h3(EditText editText) {
        String obj = editText.getText().toString();
        this.f8411y0 = obj;
        if (obj.isEmpty()) {
            Toast.makeText(getApplicationContext(), C4492f.crop_title_no_empty, 0).show();
        } else if (!C4494a.m19698g(this.f8411y0)) {
            Toast.makeText(getApplicationContext(), C4492f.save_error, 0).show();
        } else {
            int i = this.f8413z0;
            if (i < 0 || i > 2) {
                this.f8413z0 = i;
                m11214D3(this.f8411y0);
            } else if (Build.VERSION.SDK_INT < 23) {
                this.f8413z0 = i;
                m11214D3(this.f8411y0);
            } else if (!Settings.System.canWrite(this)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this, C4493g.CropAlertDialog);
                builder.setTitle(C4492f.apply_permission_title);
                builder.setMessage(C4492f.apply_permission_msg);
                builder.setPositiveButton(C4492f.main_ok, new C2397f());
                builder.setNegativeButton(C4492f.cancel_s, new C2398g(this));
                builder.create().show();
            } else {
                this.f8413z0 = i;
                m11214D3(this.f8411y0);
            }
        }
    }

    /* renamed from: i3 */
    private void m11260i3() {
        ImageView imageView = this.f8381U;
        if (imageView != null) {
            if (this.f8399m0) {
                imageView.setImageResource(C4489c.ic_cut_pause);
            } else {
                imageView.setImageResource(C4489c.ic_cut_play);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public void m11262j3() {
        try {
            this.f8360J.setSoundFile(this.f8348D);
            this.f8360J.mo9447k(this.f8407u0);
        } catch (OutOfMemoryError unused) {
        }
        this.f8389c0 = this.f8360J.mo9439g();
        this.f8392f0 = -1;
        this.f8393g0 = -1;
        this.f8402p0 = false;
        this.f8394h0 = 0;
        this.f8395i0 = 0;
        m11211B3();
        int i = this.f8391e0;
        int i2 = this.f8389c0;
        if (i > i2) {
            this.f8391e0 = i2;
        }
        String str = this.f8348D.mo9471h() + ", " + this.f8348D.mo9476m() + " Hz, " + this.f8348D.mo9470g() + " kbps, " + m11264k3(this.f8389c0) + " ";
        this.f8387a0 = str;
        this.f8366M.setText(str);
        m11236O3(true);
    }

    /* renamed from: k3 */
    private String m11264k3(int i) {
        WaveformView waveformView = this.f8360J;
        if (waveformView == null || !waveformView.mo9438f()) {
            return BuildConfig.FLAVOR;
        }
        int j = (int) this.f8360J.mo9446j(i);
        int i2 = j / 60;
        int i3 = j % 60;
        StringBuffer stringBuffer = new StringBuffer();
        if (i2 >= 10) {
            stringBuffer.append(i2);
        } else {
            stringBuffer.append("0" + i2);
        }
        stringBuffer.append(":");
        if (i3 >= 10) {
            stringBuffer.append(i3);
        } else {
            stringBuffer.append("0" + i3);
        }
        return stringBuffer.toString();
    }

    /* renamed from: l3 */
    private boolean m11266l3() {
        this.f8400n0 = null;
        this.f8348D = null;
        if (getIntent() == null) {
            return false;
        }
        this.f8359I0 = getIntent().getLongExtra("audioId", -1);
        this.f8352F = getIntent().getStringExtra("path");
        this.f8370O = getIntent().getStringExtra("title");
        this.f8358I = getIntent().getBooleanExtra("useFile", false);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public double m11268m3(int i) {
        return mo9374e3(Double.valueOf(this.f8360J.mo9446j(i)));
    }

    /* renamed from: n3 */
    private String m11270n3() {
        String d = C4494a.m19695d();
        File file = new File(d);
        file.mkdirs();
        return !file.isDirectory() ? "/sdcard" : d;
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public void m11272o3(CharSequence charSequence, CharSequence charSequence2, Exception exc) {
        SharedPreferences preferences = getPreferences(0);
        int i = preferences.getInt("error_count", 0);
        SharedPreferences.Editor edit = preferences.edit();
        edit.putInt("error_count", i + 1);
        edit.commit();
        m11230L3(exc, charSequence2);
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public synchronized void m11274p3() {
        MediaPlayer mediaPlayer = this.f8400n0;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.f8400n0.pause();
        }
        WaveformView waveformView = this.f8360J;
        if (waveformView != null) {
            waveformView.setPlayback(-1);
        }
        this.f8399m0 = false;
        m11260i3();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public void m11276q3(Uri uri) {
        String uri2 = uri != null ? uri.toString() : BuildConfig.FLAVOR;
        String substring = uri2.substring(uri2.lastIndexOf("/") + 1, uri2.length());
        try {
            ContentValues contentValues = new ContentValues();
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                contentValues.put("is_pending", 1);
                getContentResolver().update(uri, contentValues, "_id=?", new String[]{substring});
                contentValues.clear();
            }
            contentValues.put("is_ringtone", Boolean.valueOf(this.f8413z0 == 0));
            contentValues.put("is_notification", Boolean.valueOf(this.f8413z0 == 1));
            contentValues.put("is_alarm", Boolean.valueOf(this.f8413z0 == 2));
            contentValues.put("is_music", Boolean.TRUE);
            if (i >= 29) {
                contentValues.put("is_pending", 0);
            }
            if (getContentResolver().update(uri, contentValues, "_id=?", new String[]{substring}) < 1) {
                getContentResolver().update(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, contentValues, "_id=?", new String[]{substring});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int i2 = this.f8413z0;
        if (i2 == 0) {
            getString(C4492f.success_ring);
            C4494a.m19701j(this, uri);
        } else if (i2 == 1) {
            getString(C4492f.success_notify);
            C4494a.m19700i(this, uri);
        } else if (i2 == 2) {
            getString(C4492f.success_alarm);
            C4494a.m19699h(this, uri);
        } else if (i2 == 3) {
            getString(C4492f.success_contact).replace("$contact", this.f8409w0);
        }
        sendBroadcast(new Intent(C4494a.m19694c(this)));
        Toast.makeText(getApplicationContext(), C4492f.record_success, 0).show();
        this.f8409w0 = null;
        this.f8408v0 = null;
        this.f8413z0 = -1;
        this.f8345B0 = true;
    }

    /* renamed from: r3 */
    private void m11278r3() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("MusicCutter.CUTTER_PAUSE_ACTION");
        registerReceiver(this.f8379S0, intentFilter);
    }

    /* renamed from: s3 */
    private void m11280s3() {
        try {
            setContentView(C4491e.activity_crop);
        } catch (Throwable unused) {
            finish();
        }
        this.f8363K0 = (AudioManager) getSystemService("audio");
        this.f8407u0 = 1.0f;
        this.f8372P = (ImageView) findViewById(C4490d.iv_back);
        this.f8374Q = (TextView) findViewById(C4490d.tv_title);
        this.f8376R = (TextView) findViewById(C4490d.tv_start_time);
        this.f8380T = (TextView) findViewById(C4490d.tv_end_time);
        this.f8378S = (TextView) findViewById(C4490d.tv_selected_length);
        this.f8381U = (ImageView) findViewById(C4490d.iv_play);
        this.f8382V = (LinearLayout) findViewById(C4490d.ll_reset);
        this.f8383W = (LinearLayout) findViewById(C4490d.ll_save);
        this.f8384X = (LinearLayout) findViewById(C4490d.ad_layout);
        this.f8385Y = (TextView) findViewById(C4490d.tv_set_start);
        this.f8386Z = (TextView) findViewById(C4490d.tv_set_end);
        C4498d.m19712b(this, this.f8384X);
        m11260i3();
        WaveformView waveformView = (WaveformView) findViewById(C4490d.waveform);
        this.f8360J = waveformView;
        waveformView.setListener(this);
        this.f8360J.setHandler(this.f8343A0);
        TextView textView = (TextView) findViewById(C4490d.info);
        this.f8366M = textView;
        textView.setText(this.f8387a0);
        this.f8389c0 = 0;
        this.f8392f0 = -1;
        this.f8393g0 = -1;
        C2438d dVar = this.f8348D;
        if (dVar != null) {
            this.f8360J.setSoundFile(dVar);
            this.f8360J.mo9447k(this.f8407u0);
            this.f8389c0 = this.f8360J.mo9439g();
        }
        MarkerView markerView = (MarkerView) findViewById(C4490d.startmarker);
        this.f8362K = markerView;
        markerView.setListener(this);
        this.f8362K.setAlpha(255);
        this.f8362K.setFocusable(true);
        this.f8362K.setFocusableInTouchMode(true);
        this.f8362K.requestFocus();
        MarkerView markerView2 = (MarkerView) findViewById(C4490d.endmarker);
        this.f8364L = markerView2;
        markerView2.setListener(this);
        this.f8364L.setAlpha(255);
        this.f8364L.setFocusable(true);
        this.f8364L.setFocusableInTouchMode(true);
        this.f8372P.setOnClickListener(this);
        this.f8382V.setOnClickListener(this);
        this.f8383W.setOnClickListener(this);
        this.f8385Y.setOnClickListener(this);
        this.f8386Z.setOnClickListener(this);
        this.f8381U.setOnClickListener(this.f8367M0);
        this.f8374Q.setText(this.f8370O);
        m11236O3(true);
    }

    /* renamed from: t3 */
    private boolean m11282t3(boolean z) {
        if (z || this.f8399m0 || this.f8402p0) {
            this.f8412z = 0;
            return true;
        }
        int i = this.f8412z;
        if (i > 5) {
            return false;
        }
        this.f8412z = i + 1;
        return true;
    }

    /* renamed from: u3 */
    private void m11284u3() {
        this.f8350E = new File(this.f8352F);
        this.f8356H = ".mp3";
        try {
            String str = this.f8352F;
            this.f8356H = str.substring(str.lastIndexOf(46));
        } catch (Throwable unused) {
        }
        String str2 = new C2447g(this, this.f8352F).f8588d;
        this.f8354G = str2;
        setTitle(str2);
        this.f8342A = System.currentTimeMillis();
        this.f8344B = true;
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f8346C = progressDialog;
        progressDialog.setProgressStyle(1);
        this.f8346C.setTitle("loading");
        this.f8346C.setCancelable(false);
        this.f8346C.setOnCancelListener(new C2401j());
        this.f8346C.show();
        C2403l lVar = new C2403l();
        this.f8401o0 = false;
        new C2404m().start();
        new C2405n(lVar).start();
    }

    /* renamed from: v3 */
    private void m11286v3() {
        int i = this.f8395i0;
        int i2 = this.f8394h0;
        int i3 = i - i2;
        int i4 = i3 > 10 ? i3 / 10 : i3 > 0 ? 1 : i3 < -10 ? i3 / 10 : i3 < 0 ? -1 : 0;
        this.f8394h0 = i2 + i4;
        if (i4 == 0) {
            this.f8355G0 = 0;
            this.f8357H0 = false;
        }
    }

    /* renamed from: w3 */
    private String m11288w3(String str, String str2) {
        String str3;
        String str4;
        String str5 = str.toString();
        int i = 0;
        if (Build.VERSION.SDK_INT < 29 || this.f8358I) {
            String n3 = m11270n3();
            while (i < 100) {
                if (i > 0) {
                    str3 = str + " - Tone" + i;
                    str4 = n3 + "/" + str3 + str2;
                } else {
                    str3 = str + " - Tone";
                    str4 = n3 + "/" + str3 + str2;
                }
                if (!new File(str4).exists()) {
                    return str3;
                }
                i++;
                str5 = str3;
            }
            return str5;
        }
        int[] a = C4495b.m19702a(this, str + " - Tone");
        if (a == null || a.length == 0) {
            return str + " - Tone";
        }
        int i2 = a[0];
        while (i < a.length) {
            if (i2 < a[i]) {
                i2 = a[i];
            }
            i++;
        }
        return str + " - Tone" + (i2 + 1);
    }

    /* renamed from: x3 */
    private void m11290x3(RelativeLayout relativeLayout, boolean z) {
        if (relativeLayout != null) {
            for (int i = 0; i < relativeLayout.getChildCount(); i++) {
                relativeLayout.getChildAt(i).setSelected(z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:24|25|26|27|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009a */
    /* renamed from: y3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m11292y3(int r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.f8399m0     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x000a
            r11.m11274p3()     // Catch:{ all -> 0x00f8 }
            monitor-exit(r11)
            return
        L_0x000a:
            android.media.MediaPlayer r0 = r11.f8400n0     // Catch:{ all -> 0x00f8 }
            if (r0 != 0) goto L_0x0010
            monitor-exit(r11)
            return
        L_0x0010:
            com.coocent.musiccutter.ringtone.WaveformView r0 = r11.f8360J     // Catch:{ Exception -> 0x00e8 }
            int r0 = r0.mo9445i(r12)     // Catch:{ Exception -> 0x00e8 }
            r11.f8396j0 = r0     // Catch:{ Exception -> 0x00e8 }
            int r0 = r11.f8390d0     // Catch:{ Exception -> 0x00e8 }
            if (r12 >= r0) goto L_0x0025
            com.coocent.musiccutter.ringtone.WaveformView r12 = r11.f8360J     // Catch:{ Exception -> 0x00e8 }
            int r12 = r12.mo9445i(r0)     // Catch:{ Exception -> 0x00e8 }
            r11.f8398l0 = r12     // Catch:{ Exception -> 0x00e8 }
            goto L_0x003c
        L_0x0025:
            int r0 = r11.f8391e0     // Catch:{ Exception -> 0x00e8 }
            if (r12 <= r0) goto L_0x0034
            com.coocent.musiccutter.ringtone.WaveformView r12 = r11.f8360J     // Catch:{ Exception -> 0x00e8 }
            int r0 = r11.f8389c0     // Catch:{ Exception -> 0x00e8 }
            int r12 = r12.mo9445i(r0)     // Catch:{ Exception -> 0x00e8 }
            r11.f8398l0 = r12     // Catch:{ Exception -> 0x00e8 }
            goto L_0x003c
        L_0x0034:
            com.coocent.musiccutter.ringtone.WaveformView r12 = r11.f8360J     // Catch:{ Exception -> 0x00e8 }
            int r12 = r12.mo9445i(r0)     // Catch:{ Exception -> 0x00e8 }
            r11.f8398l0 = r12     // Catch:{ Exception -> 0x00e8 }
        L_0x003c:
            r12 = 0
            r11.f8397k0 = r12     // Catch:{ Exception -> 0x00e8 }
            com.coocent.musiccutter.ringtone.WaveformView r0 = r11.f8360J     // Catch:{ Exception -> 0x00e8 }
            int r1 = r11.f8396j0     // Catch:{ Exception -> 0x00e8 }
            double r1 = (double) r1     // Catch:{ Exception -> 0x00e8 }
            r3 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            double r1 = r1 * r3
            int r0 = r0.mo9448l(r1)     // Catch:{ Exception -> 0x00e8 }
            com.coocent.musiccutter.ringtone.WaveformView r1 = r11.f8360J     // Catch:{ Exception -> 0x00e8 }
            int r2 = r11.f8398l0     // Catch:{ Exception -> 0x00e8 }
            double r5 = (double) r2     // Catch:{ Exception -> 0x00e8 }
            double r5 = r5 * r3
            int r1 = r1.mo9448l(r5)     // Catch:{ Exception -> 0x00e8 }
            com.coocent.musiccutter.ringtone.d r2 = r11.f8348D     // Catch:{ Exception -> 0x00e8 }
            int r0 = r2.mo9491o(r0)     // Catch:{ Exception -> 0x00e8 }
            com.coocent.musiccutter.ringtone.d r2 = r11.f8348D     // Catch:{ Exception -> 0x00e8 }
            int r1 = r2.mo9491o(r1)     // Catch:{ Exception -> 0x00e8 }
            boolean r2 = r11.f8401o0     // Catch:{ Exception -> 0x00e8 }
            if (r2 == 0) goto L_0x00b6
            if (r0 < 0) goto L_0x00b6
            if (r1 < 0) goto L_0x00b6
            r2 = 3
            android.media.MediaPlayer r3 = r11.f8400n0     // Catch:{ Exception -> 0x009a }
            r3.reset()     // Catch:{ Exception -> 0x009a }
            android.media.MediaPlayer r3 = r11.f8400n0     // Catch:{ Exception -> 0x009a }
            r3.setAudioStreamType(r2)     // Catch:{ Exception -> 0x009a }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x009a }
            java.io.File r4 = r11.f8350E     // Catch:{ Exception -> 0x009a }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ Exception -> 0x009a }
            r3.<init>(r4)     // Catch:{ Exception -> 0x009a }
            android.media.MediaPlayer r5 = r11.f8400n0     // Catch:{ Exception -> 0x009a }
            java.io.FileDescriptor r6 = r3.getFD()     // Catch:{ Exception -> 0x009a }
            long r7 = (long) r0     // Catch:{ Exception -> 0x009a }
            int r1 = r1 - r0
            long r9 = (long) r1     // Catch:{ Exception -> 0x009a }
            r5.setDataSource(r6, r7, r9)     // Catch:{ Exception -> 0x009a }
            android.media.MediaPlayer r0 = r11.f8400n0     // Catch:{ Exception -> 0x009a }
            r0.prepare()     // Catch:{ Exception -> 0x009a }
            int r0 = r11.f8396j0     // Catch:{ Exception -> 0x009a }
            r11.f8397k0 = r0     // Catch:{ Exception -> 0x009a }
            goto L_0x00b6
        L_0x009a:
            android.media.MediaPlayer r0 = r11.f8400n0     // Catch:{ Exception -> 0x00e8 }
            r0.reset()     // Catch:{ Exception -> 0x00e8 }
            android.media.MediaPlayer r0 = r11.f8400n0     // Catch:{ Exception -> 0x00e8 }
            r0.setAudioStreamType(r2)     // Catch:{ Exception -> 0x00e8 }
            android.media.MediaPlayer r0 = r11.f8400n0     // Catch:{ Exception -> 0x00e8 }
            java.io.File r1 = r11.f8350E     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x00e8 }
            r0.setDataSource(r1)     // Catch:{ Exception -> 0x00e8 }
            android.media.MediaPlayer r0 = r11.f8400n0     // Catch:{ Exception -> 0x00e8 }
            r0.prepare()     // Catch:{ Exception -> 0x00e8 }
            r11.f8397k0 = r12     // Catch:{ Exception -> 0x00e8 }
        L_0x00b6:
            android.media.MediaPlayer r12 = r11.f8400n0     // Catch:{ Exception -> 0x00e8 }
            com.coocent.musiccutter.activity.CropMusicActivity$v r0 = new com.coocent.musiccutter.activity.CropMusicActivity$v     // Catch:{ Exception -> 0x00e8 }
            r0.<init>()     // Catch:{ Exception -> 0x00e8 }
            r12.setOnCompletionListener(r0)     // Catch:{ Exception -> 0x00e8 }
            r12 = 1
            r11.f8399m0 = r12     // Catch:{ Exception -> 0x00e8 }
            int r0 = r11.f8397k0     // Catch:{ Exception -> 0x00e8 }
            if (r0 != 0) goto L_0x00ce
            android.media.MediaPlayer r0 = r11.f8400n0     // Catch:{ Exception -> 0x00e8 }
            int r1 = r11.f8396j0     // Catch:{ Exception -> 0x00e8 }
            r0.seekTo(r1)     // Catch:{ Exception -> 0x00e8 }
        L_0x00ce:
            r11.m11209A3()     // Catch:{ Exception -> 0x00e8 }
            android.media.MediaPlayer r0 = r11.f8400n0     // Catch:{ Exception -> 0x00e8 }
            r0.start()     // Catch:{ Exception -> 0x00e8 }
            r11.m11236O3(r12)     // Catch:{ Exception -> 0x00e8 }
            r11.m11260i3()     // Catch:{ Exception -> 0x00e8 }
            android.content.Intent r12 = new android.content.Intent     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r0 = "MusicCutter.CUTTER_MUSIC_PLAY"
            r12.<init>(r0)     // Catch:{ Exception -> 0x00e8 }
            r11.sendBroadcast(r12)     // Catch:{ Exception -> 0x00e8 }
            monitor-exit(r11)
            return
        L_0x00e8:
            r12 = move-exception
            android.content.res.Resources r0 = r11.getResources()     // Catch:{ all -> 0x00f8 }
            int r1 = p159f.p166c.p199f.C4492f.error     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ all -> 0x00f8 }
            r11.m11230L3(r12, r0)     // Catch:{ all -> 0x00f8 }
            monitor-exit(r11)
            return
        L_0x00f8:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.musiccutter.activity.CropMusicActivity.m11292y3(int):void");
    }

    /* renamed from: z3 */
    private void m11294z3() {
        int i = this.f8390d0;
        int i2 = 0;
        if (i == 0 && this.f8391e0 == this.f8389c0) {
            Toast.makeText(getApplicationContext(), C4492f.crop_no_crop, 0).show();
        } else if (i == this.f8391e0) {
            Toast.makeText(getApplicationContext(), C4492f.crop_no_crop, 0).show();
        } else {
            if (this.f8399m0) {
                m11274p3();
            }
            this.f8413z0 = -1;
            View inflate = LayoutInflater.from(getApplicationContext()).inflate(C4491e.dialog_save_crop, (ViewGroup) null);
            EditText editText = (EditText) inflate.findViewById(C4490d.titleEdit);
            String w3 = m11288w3(this.f8354G, this.f8356H);
            this.f8411y0 = w3;
            editText.setText(w3);
            String str = this.f8411y0;
            if (str != null) {
                i2 = str.length();
            }
            editText.setSelection(i2);
            editText.setFocusable(true);
            editText.setFocusableInTouchMode(true);
            editText.requestFocus();
            C4501f.m19720e(getApplicationContext(), editText, true);
            editText.addTextChangedListener(new C2423x(editText));
            if (this.f8358I) {
                inflate.findViewById(C4490d.phoneLayout).setVisibility(8);
                inflate.findViewById(C4490d.notifyLayout).setVisibility(8);
                inflate.findViewById(C4490d.alarmLayout).setVisibility(8);
                inflate.findViewById(C4490d.contactLayout).setVisibility(8);
            }
            inflate.findViewById(C4490d.phoneLayout).setOnClickListener(new C2424y());
            inflate.findViewById(C4490d.notifyLayout).setOnClickListener(new C2425z());
            inflate.findViewById(C4490d.alarmLayout).setOnClickListener(new C2389a());
            inflate.findViewById(C4490d.contactLayout).setOnClickListener(new C2392b(this));
            AlertDialog create = new AlertDialog.Builder(this, C4493g.CropAlertDialog).create();
            create.setOnShowListener(new C2393c(editText));
            create.show();
            create.setContentView(inflate);
            create.getWindow().clearFlags(131072);
            inflate.findViewById(C4490d.btn_cancel).setOnClickListener(new C2395d(this, create));
            inflate.findViewById(C4490d.btn_ok).setOnClickListener(new C2396e(editText, create));
        }
    }

    /* renamed from: C3 */
    public void mo9367C3() {
        this.f8390d0 = this.f8360J.mo9449m(0.0d);
        int m = this.f8360J.mo9449m(15.0d);
        this.f8391e0 = m;
        int i = this.f8389c0;
        if (m > i) {
            this.f8391e0 = i;
        }
        this.f8347C0 = m11268m3(this.f8390d0);
        this.f8349D0 = m11268m3(this.f8391e0);
        this.f8395i0 = 0;
        m11236O3(true);
        Toast.makeText(getApplicationContext(), C4492f.crop_reset_success, 0).show();
    }

    /* renamed from: G0 */
    public void mo9368G0(MarkerView markerView) {
    }

    /* renamed from: V */
    public void mo9369V(MarkerView markerView) {
        this.f8402p0 = false;
        if (markerView == this.f8362K) {
            m11226J3();
        } else {
            m11220G3();
        }
    }

    /* renamed from: a */
    public void mo9370a(float f, float f2) {
        this.f8402p0 = true;
        this.f8403q0 = f;
        this.f8404r0 = this.f8394h0;
        this.f8351E0 = f2;
    }

    public void addEnd(View view) {
        m11254f3(true);
    }

    public void addStart(View view) {
        m11256g3(true);
    }

    /* renamed from: d1 */
    public void mo9373d1(MarkerView markerView, int i) {
        this.f8368N = true;
        if (markerView == this.f8362K) {
            int i2 = this.f8390d0;
            int M3 = m11232M3(i2 - i);
            this.f8390d0 = M3;
            this.f8391e0 = m11232M3(this.f8391e0 - (i2 - M3));
            m11226J3();
        }
        if (markerView == this.f8364L) {
            int i3 = this.f8391e0;
            int i4 = this.f8390d0;
            if (i3 == i4) {
                int M32 = m11232M3(i4 - i);
                this.f8390d0 = M32;
                this.f8391e0 = M32;
            } else {
                this.f8391e0 = m11232M3(i3 - i);
            }
            m11220G3();
        }
        m11236O3(true);
    }

    /* renamed from: e3 */
    public double mo9374e3(Double d) {
        Locale locale = Locale.getDefault();
        try {
            Locale.setDefault(Locale.US);
            return Double.parseDouble(new DecimalFormat("0.0").format(d));
        } catch (Exception e) {
            e.printStackTrace();
            String valueOf = String.valueOf(d);
            try {
                return Double.valueOf(valueOf.substring(0, valueOf.indexOf(".") + 2)).doubleValue();
            } catch (Exception unused) {
                return 0.0d;
            }
        } finally {
            Locale.setDefault(locale);
        }
    }

    /* renamed from: n */
    public void mo9375n() {
        this.f8388b0 = this.f8360J.getMeasuredWidth();
        if (this.f8395i0 != this.f8394h0 && !this.f8368N) {
            m11236O3(false);
        } else if (this.f8399m0) {
            m11236O3(false);
        }
    }

    /* renamed from: o0 */
    public void mo9376o0(MarkerView markerView, float f) {
        this.f8360J.setLineStart(markerView == this.f8362K);
        this.f8402p0 = true;
        this.f8403q0 = f;
        this.f8405s0 = this.f8390d0;
        this.f8406t0 = this.f8391e0;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 4657) {
            if (Build.VERSION.SDK_INT >= 29) {
                if (i2 == -1) {
                    m11276q3(Uri.parse(this.f8361J0));
                }
            } else {
                return;
            }
        }
        if (i == 101) {
            m11294z3();
        } else if (i2 == 301) {
            if (intent != null) {
                this.f8408v0 = intent.getStringExtra("contactID");
                this.f8409w0 = intent.getStringExtra("contactName");
                String str = this.f8408v0;
                if (str != null && str.length() > 0) {
                    m11290x3((RelativeLayout) this.f8375Q0, true);
                    if (this.f8413z0 != 3) {
                        m11290x3(this.f8373P0, false);
                    }
                    this.f8373P0 = (RelativeLayout) this.f8375Q0;
                    this.f8413z0 = 3;
                }
            }
        } else if (i2 == -1) {
            String uri = intent.getData().toString();
            this.f8352F = uri;
            if (!uri.equals("record")) {
                m11284u3();
            }
        }
    }

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("hasCut", this.f8345B0);
        setResult(101, intent);
        finish();
        overridePendingTransition(C4487a.slide_left_in, C4487a.slide_right_out);
    }

    public void onClick(View view) {
        WaveformView waveformView;
        int id = view.getId();
        if (id == C4490d.iv_back) {
            onBackPressed();
        } else if (id == C4490d.ll_reset) {
            mo9367C3();
        } else if (id == C4490d.ll_save) {
            m11294z3();
        } else if (id == C4490d.tv_set_start) {
            C2453a x3 = C2453a.m11494x3(this.f8347C0, 0.0d, this.f8349D0, getString(C4492f.set_start));
            x3.mo9514y3(new C2402k());
            x3.mo3841h3(mo3730H1(), "SetTimeFragmentDialog");
        } else if (id == C4490d.tv_set_end && (waveformView = this.f8360J) != null && waveformView.mo9438f()) {
            C2453a x32 = C2453a.m11494x3(this.f8349D0, this.f8347C0, this.f8360J.mo9446j(this.f8389c0), getString(C4492f.set_end));
            x32.mo9514y3(new C2418s());
            x32.mo3841h3(mo3730H1(), "SetTimeFragmentDialog");
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4500e.m19715a(this);
        if (m11266l3()) {
            m11280s3();
            m11278r3();
            Handler handler = this.f8343A0;
            if (handler != null) {
                handler.postDelayed(this.f8377R0, 100);
            }
            try {
                m11284u3();
            } catch (Exception unused) {
            }
        } else {
            Toast.makeText(this, getString(C4492f.error), 0).show();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        m11253e2();
        MediaPlayer mediaPlayer = this.f8400n0;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.f8400n0.stop();
                this.f8400n0.release();
            }
            this.f8400n0 = null;
        }
        Handler handler = this.f8365L0;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f8365L0 = null;
        }
        Handler handler2 = this.f8343A0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages((Object) null);
            this.f8343A0 = null;
        }
        if (this.f8360J != null) {
            this.f8360J = null;
        }
        C4498d.m19711a();
        LinearLayout linearLayout = this.f8384X;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            this.f8384X = null;
        }
        try {
            BroadcastReceiver broadcastReceiver = this.f8379S0;
            if (broadcastReceiver != null) {
                unregisterReceiver(broadcastReceiver);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        m11274p3();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m11209A3();
    }

    /* renamed from: p */
    public void mo9378p() {
    }

    /* renamed from: q */
    public void mo9379q(float f, float f2) {
        if (this.f8355G0 != 0) {
            this.f8355G0 = 0;
        }
        this.f8394h0 = m11232M3((int) (((float) this.f8404r0) + (this.f8403q0 - f)));
        m11236O3(false);
    }

    /* renamed from: q1 */
    public void mo9380q1(MarkerView markerView, float f) {
        float f2 = f - this.f8403q0;
        if (markerView == this.f8362K) {
            this.f8390d0 = m11232M3((int) (((float) this.f8405s0) + f2));
            this.f8391e0 = m11232M3((int) (((float) this.f8406t0) + f2));
        } else {
            int M3 = m11232M3((int) (((float) this.f8406t0) + f2));
            this.f8391e0 = M3;
            int i = this.f8390d0;
            if (M3 < i) {
                this.f8391e0 = i;
            }
        }
        this.f8347C0 = m11268m3(this.f8390d0);
        this.f8349D0 = m11268m3(this.f8391e0);
        m11236O3(true);
    }

    /* renamed from: r0 */
    public void mo9381r0(MarkerView markerView) {
        this.f8368N = false;
        if (markerView == this.f8362K) {
            m11228K3();
        } else {
            m11222H3();
        }
        Handler handler = this.f8343A0;
        if (handler != null) {
            handler.postDelayed(new C2416q(), 100);
        }
    }

    /* renamed from: s */
    public void mo9382s(float f) {
        this.f8353F0 = f;
        this.f8402p0 = false;
        this.f8395i0 = this.f8394h0;
        if (Math.abs(f - this.f8351E0) < 20.0f) {
            int paddingStart = (int) ((this.f8403q0 + ((float) this.f8394h0)) - ((float) this.f8360J.getPaddingStart()));
            if (this.f8399m0) {
                int i = this.f8360J.mo9445i(paddingStart);
                if (i < this.f8396j0 || i >= this.f8398l0) {
                    m11274p3();
                } else {
                    this.f8400n0.seekTo(i - this.f8397k0);
                }
            } else {
                m11292y3(paddingStart);
            }
        }
    }

    /* renamed from: s0 */
    public void mo9383s0(MarkerView markerView, int i) {
        this.f8368N = true;
        if (markerView == this.f8362K) {
            int i2 = this.f8390d0;
            int i3 = i2 + i;
            this.f8390d0 = i3;
            int i4 = this.f8389c0;
            if (i3 > i4) {
                this.f8390d0 = i4;
            }
            int i5 = this.f8391e0 + (this.f8390d0 - i2);
            this.f8391e0 = i5;
            if (i5 > i4) {
                this.f8391e0 = i4;
            }
            m11226J3();
        }
        if (markerView == this.f8364L) {
            int i6 = this.f8391e0 + i;
            this.f8391e0 = i6;
            int i7 = this.f8389c0;
            if (i6 > i7) {
                this.f8391e0 = i7;
            }
            m11220G3();
        }
        m11236O3(true);
    }

    public void secEnd(View view) {
        m11254f3(false);
    }

    public void secStart(View view) {
        m11256g3(false);
    }

    public void setEnd(View view) {
        m11216E3(false);
    }

    public void setStart(View view) {
        m11216E3(true);
    }

    /* renamed from: t */
    public void mo9388t() {
        this.f8368N = false;
        m11236O3(true);
    }
}
