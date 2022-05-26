package coocent.music.player.activity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
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
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.widget.DeepCropTitle;
import coocent.music.player.widget.ringtone.C7284d;
import coocent.music.player.widget.ringtone.C7289f;
import coocent.music.player.widget.ringtone.C7290g;
import coocent.music.player.widget.ringtone.C7292h;
import coocent.music.player.widget.ringtone.C7295i;
import coocent.music.player.widget.ringtone.C7296j;
import coocent.music.player.widget.ringtone.MarkerView;
import coocent.music.player.widget.ringtone.WaveformView;
import coocent.musiclibrary.music.p292j.C7397j;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.ads.AdHelper;
import net.coocent.android.xmlparser.ads.C9387i;
import net.coocent.android.xmlparser.p461z.C9566f;
import p342g.p343a.p344a.p346c.C7970w;
import p342g.p343a.p344a.p358i.C8311c;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8340q;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;
import p402l.p406b.p407a.C8942a;
import p402l.p406b.p407a.C8943b;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p413g.C9017c;
import p402l.p406b.p407a.p413g.C9018d;
import p402l.p406b.p407a.p413g.C9022h;
import p402l.p406b.p426c.C9123c;
import p402l.p406b.p426c.C9130j;
import p402l.p406b.p426c.C9131k;
import p443m.p444a.p447e.p448a.C9332d;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class CropActivity extends AnimationActivity implements MarkerView.C7275a, WaveformView.C7276a {

    /* renamed from: X0 */
    private static int f30407X0;

    /* renamed from: Y0 */
    private static int f30408Y0;

    /* renamed from: Z0 */
    private static final int f30409Z0;

    /* renamed from: a1 */
    private static final int f30410a1;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f30411A;
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public EditText f30412A0;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public ProgressDialog f30413B;
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public double f30414B0;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C7284d f30415C;
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public double f30416C0;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public File f30417D;
    /* access modifiers changed from: private */

    /* renamed from: D0 */
    public boolean f30418D0 = true;

    /* renamed from: E */
    private String f30419E;
    /* access modifiers changed from: private */

    /* renamed from: E0 */
    public boolean f30420E0 = false;

    /* renamed from: F */
    private String f30421F;

    /* renamed from: F0 */
    private float f30422F0 = 0.0f;

    /* renamed from: G */
    private String f30423G;

    /* renamed from: G0 */
    private float f30424G0 = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public WaveformView f30425H;
    /* access modifiers changed from: private */

    /* renamed from: H0 */
    public int f30426H0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public MarkerView f30427I;
    /* access modifiers changed from: private */

    /* renamed from: I0 */
    public boolean f30428I0 = false;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public MarkerView f30429J;

    /* renamed from: J0 */
    private TextView f30430J0;

    /* renamed from: K */
    private TextView f30431K;

    /* renamed from: K0 */
    private ImageView f30432K0;

    /* renamed from: L */
    private ImageButton f30433L;

    /* renamed from: L0 */
    private RelativeLayout f30434L0;

    /* renamed from: M */
    private ImageButton f30435M;

    /* renamed from: M0 */
    private C6825d0 f30436M0;

    /* renamed from: N */
    private ImageButton f30437N;

    /* renamed from: N0 */
    private View f30438N0;

    /* renamed from: O */
    private ImageButton f30439O;

    /* renamed from: O0 */
    Handler f30440O0 = new C6855y();

    /* renamed from: P */
    private ImageButton f30441P;

    /* renamed from: P0 */
    private View.OnClickListener f30442P0 = new C6856z();

    /* renamed from: Q */
    private boolean f30443Q;

    /* renamed from: Q0 */
    private View.OnClickListener f30444Q0 = new C6819a0();
    /* access modifiers changed from: private */

    /* renamed from: R */
    public String f30445R;

    /* renamed from: R0 */
    private View.OnClickListener f30446R0 = new C6823c0();

    /* renamed from: S */
    private String f30447S;

    /* renamed from: S0 */
    private View.OnClickListener f30448S0 = new C6818a();

    /* renamed from: T */
    private String f30449T = BuildConfig.FLAVOR;

    /* renamed from: T0 */
    private View.OnClickListener f30450T0 = new C6820b();

    /* renamed from: U */
    private int f30451U;

    /* renamed from: U0 */
    private RelativeLayout f30452U0;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public int f30453V;

    /* renamed from: V0 */
    private View f30454V0;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public int f30455W;
    /* access modifiers changed from: private */

    /* renamed from: W0 */
    public Runnable f30456W0 = new C6839o();
    /* access modifiers changed from: private */

    /* renamed from: X */
    public int f30457X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public int f30458Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public int f30459Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public int f30460a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public int f30461b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public int f30462c0;

    /* renamed from: d0 */
    private int f30463d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public int f30464e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public boolean f30465f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public MediaPlayer f30466g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public boolean f30467h0;

    /* renamed from: i0 */
    private boolean f30468i0;

    /* renamed from: j0 */
    private float f30469j0;

    /* renamed from: k0 */
    private int f30470k0;

    /* renamed from: l0 */
    private int f30471l0;

    /* renamed from: m0 */
    private int f30472m0;

    /* renamed from: n0 */
    private float f30473n0;

    /* renamed from: o0 */
    private DeepCropTitle f30474o0;

    /* renamed from: p0 */
    private String f30475p0;

    /* renamed from: q0 */
    private String f30476q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public MediaScannerConnection f30477r0;

    /* renamed from: s0 */
    private String f30478s0;

    /* renamed from: t0 */
    private String f30479t0;

    /* renamed from: u0 */
    private int f30480u0;

    /* renamed from: v0 */
    int f30481v0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public Handler f30482w0 = new Handler();

    /* renamed from: x0 */
    private boolean f30483x0 = false;

    /* renamed from: y0 */
    private TextView f30484y0;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public long f30485z;
    /* access modifiers changed from: private */

    /* renamed from: z0 */
    public EditText f30486z0;

    /* renamed from: coocent.music.player.activity.CropActivity$a */
    class C6818a implements View.OnClickListener {
        C6818a() {
        }

        public void onClick(View view) {
            if (CropActivity.this.f30465f0) {
                int currentPosition = CropActivity.this.f30466g0.getCurrentPosition() - 5000;
                if (currentPosition < CropActivity.this.f30462c0) {
                    currentPosition = CropActivity.this.f30462c0;
                }
                CropActivity.this.f30466g0.seekTo(currentPosition);
                return;
            }
            CropActivity.this.f30427I.requestFocus();
            CropActivity cropActivity = CropActivity.this;
            cropActivity.mo26524O0(cropActivity.f30427I);
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$a0 */
    class C6819a0 implements View.OnClickListener {
        C6819a0() {
        }

        public void onClick(View view) {
            boolean unused = CropActivity.this.f30418D0 = false;
            CropActivity.this.f30425H.mo27939q();
            CropActivity cropActivity = CropActivity.this;
            int unused2 = cropActivity.f30455W = cropActivity.f30425H.getStart();
            CropActivity cropActivity2 = CropActivity.this;
            int unused3 = cropActivity2.f30457X = cropActivity2.f30425H.getEnd();
            CropActivity cropActivity3 = CropActivity.this;
            int unused4 = cropActivity3.f30453V = cropActivity3.f30425H.mo27928h();
            CropActivity cropActivity4 = CropActivity.this;
            int unused5 = cropActivity4.f30460a0 = cropActivity4.f30425H.getOffset();
            CropActivity cropActivity5 = CropActivity.this;
            int unused6 = cropActivity5.f30461b0 = cropActivity5.f30460a0;
            CropActivity.this.m38918u3();
            CropActivity.this.m38888e4(true);
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$b */
    class C6820b implements View.OnClickListener {
        C6820b() {
        }

        public void onClick(View view) {
            if (CropActivity.this.f30465f0) {
                int currentPosition = CropActivity.this.f30466g0.getCurrentPosition() + 5000;
                if (currentPosition > CropActivity.this.f30464e0) {
                    currentPosition = CropActivity.this.f30464e0;
                }
                CropActivity.this.f30466g0.seekTo(currentPosition);
                return;
            }
            CropActivity.this.f30429J.requestFocus();
            CropActivity cropActivity = CropActivity.this;
            cropActivity.mo26524O0(cropActivity.f30429J);
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$b0 */
    class C6821b0 implements View.OnSystemUiVisibilityChangeListener {
        C6821b0() {
        }

        public void onSystemUiVisibilityChange(int i) {
            if (i == 1) {
                CropActivity.this.m38862S3(BaseApplication.f31157u);
                return;
            }
            CropActivity cropActivity = CropActivity.this;
            cropActivity.m38862S3(C9566f.m50190a(cropActivity, 5));
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$c */
    class C6822c implements MediaPlayer.OnCompletionListener {
        C6822c() {
        }

        public synchronized void onCompletion(MediaPlayer mediaPlayer) {
            CropActivity.this.m38835E3();
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$c0 */
    class C6823c0 implements View.OnClickListener {
        C6823c0() {
        }

        public void onClick(View view) {
            CropActivity cropActivity = CropActivity.this;
            cropActivity.m38851M3(cropActivity.f30455W);
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$d */
    class C6824d implements DialogInterface.OnShowListener {

        /* renamed from: g */
        final /* synthetic */ EditText f30493g;

        C6824d(CropActivity cropActivity, EditText editText) {
            this.f30493g = editText;
        }

        public void onShow(DialogInterface dialogInterface) {
            ((InputMethodManager) this.f30493g.getContext().getSystemService("input_method")).showSoftInput(this.f30493g, 0);
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$d0 */
    private class C6825d0 extends BroadcastReceiver {
        private C6825d0() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT")) {
                CropActivity.this.finish();
            }
        }

        /* synthetic */ C6825d0(CropActivity cropActivity, C6835k kVar) {
            this();
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$e */
    class C6826e implements View.OnClickListener {
        C6826e() {
        }

        public void onClick(View view) {
            CropActivity.this.m38883d2((RelativeLayout) view, 0);
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$e0 */
    class C6827e0 implements MediaScannerConnection.MediaScannerConnectionClient {

        /* renamed from: a */
        private String f30496a;

        /* renamed from: coocent.music.player.activity.CropActivity$e0$a */
        class C6828a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ Uri f30498g;

            C6828a(Uri uri) {
                this.f30498g = uri;
            }

            public void run() {
                CropActivity.this.m38837F3(this.f30498g);
            }
        }

        public C6827e0(String str) {
            this.f30496a = str;
        }

        public void onMediaScannerConnected() {
            CropActivity.this.f30477r0.scanFile(this.f30496a, (String) null);
        }

        public void onScanCompleted(String str, Uri uri) {
            CropActivity.this.f30482w0.post(new C6828a(uri));
            CropActivity.this.f30477r0.disconnect();
            MediaScannerConnection unused = CropActivity.this.f30477r0 = null;
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$f */
    class C6829f implements View.OnClickListener {
        C6829f() {
        }

        public void onClick(View view) {
            CropActivity.this.m38883d2((RelativeLayout) view, 1);
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$g */
    class C6830g implements View.OnClickListener {
        C6830g() {
        }

        public void onClick(View view) {
            CropActivity.this.m38883d2((RelativeLayout) view, 2);
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$h */
    class C6831h implements View.OnClickListener {
        C6831h(CropActivity cropActivity) {
        }

        public void onClick(View view) {
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$i */
    class C6832i implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ AlertDialog f30502g;

        C6832i(CropActivity cropActivity, AlertDialog alertDialog) {
            this.f30502g = alertDialog;
        }

        public void onClick(View view) {
            this.f30502g.dismiss();
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$j */
    class C6833j implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ EditText f30503g;

        /* renamed from: coocent.music.player.activity.CropActivity$j$a */
        class C6834a implements C9387i {
            C6834a() {
            }

            /* renamed from: a */
            public void mo26565a() {
                C6833j jVar = C6833j.this;
                CropActivity.this.m38914s3(jVar.f30503g);
            }
        }

        C6833j(EditText editText) {
            this.f30503g = editText;
        }

        public void onClick(View view) {
            if (!AdHelper.m49536p().mo32459v(CropActivity.this, new C6834a())) {
                CropActivity.this.m38914s3(this.f30503g);
            }
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$k */
    class C6835k implements TextWatcher {
        C6835k() {
        }

        public void afterTextChanged(Editable editable) {
            boolean unused = CropActivity.this.f30418D0 = false;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence == null || TextUtils.isEmpty(charSequence) || !CropActivity.this.f30425H.mo27923g() || !CropActivity.this.f30420E0) {
                boolean unused = CropActivity.this.f30418D0 = true;
            } else if (CropActivity.this.f30457X < CropActivity.this.f30455W) {
                CropActivity cropActivity = CropActivity.this;
                int unused2 = cropActivity.f30455W = cropActivity.f30457X;
                CropActivity cropActivity2 = CropActivity.this;
                double unused3 = cropActivity2.f30414B0 = cropActivity2.m38829B3(cropActivity2.f30455W);
                boolean unused4 = CropActivity.this.f30418D0 = true;
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence != null && !TextUtils.isEmpty(charSequence) && CropActivity.this.f30425H.mo27923g() && CropActivity.this.f30420E0) {
                if (CropActivity.this.f30418D0) {
                    boolean unused = CropActivity.this.f30418D0 = false;
                    return;
                }
                String charSequence2 = charSequence.toString();
                int length = charSequence2.length() - 1;
                if (charSequence2.contains(".")) {
                    int indexOf = charSequence2.indexOf(".");
                    StringBuilder sb = new StringBuilder();
                    boolean unused2 = CropActivity.this.f30418D0 = true;
                    if (indexOf == 0) {
                        sb.append("0.");
                        if (length == 0) {
                            sb.append("0");
                            charSequence2 = sb.toString();
                            indexOf = 1;
                        } else if (length >= 1) {
                            sb.append(charSequence2.substring(1, 2));
                            charSequence2 = sb.toString();
                        } else {
                            charSequence2 = BuildConfig.FLAVOR;
                        }
                    } else if (indexOf == length) {
                        sb.append(charSequence2);
                        sb.append("0");
                        charSequence2 = sb.toString();
                    }
                    if ((charSequence2.length() - 1) - indexOf > 1) {
                        boolean unused3 = CropActivity.this.f30418D0 = false;
                    }
                    CropActivity cropActivity = CropActivity.this;
                    double unused4 = cropActivity.f30414B0 = cropActivity.m38928z3(charSequence2);
                } else {
                    boolean unused5 = CropActivity.this.f30418D0 = true;
                    if (charSequence2.equals(BuildConfig.FLAVOR)) {
                        double unused6 = CropActivity.this.f30414B0 = 0.0d;
                    } else {
                        CropActivity cropActivity2 = CropActivity.this;
                        double unused7 = cropActivity2.f30414B0 = cropActivity2.m38928z3(charSequence2);
                    }
                }
                CropActivity cropActivity3 = CropActivity.this;
                int unused8 = cropActivity3.f30455W = cropActivity3.f30425H.mo27934n(CropActivity.this.f30414B0);
                Log.d("onTextChanged:", CropActivity.this.f30455W + "==" + CropActivity.this.f30457X);
                if (CropActivity.this.f30455W > CropActivity.this.f30457X) {
                    boolean unused9 = CropActivity.this.f30418D0 = false;
                    CropActivity cropActivity4 = CropActivity.this;
                    int unused10 = cropActivity4.f30455W = cropActivity4.f30457X;
                    CropActivity cropActivity5 = CropActivity.this;
                    double unused11 = cropActivity5.f30414B0 = cropActivity5.m38829B3(cropActivity5.f30455W);
                }
                CropActivity.this.m38888e4(true);
            }
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$l */
    class C6836l implements DialogInterface.OnClickListener {
        C6836l() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS", Uri.parse("package:" + CropActivity.this.getPackageName()));
            intent.addFlags(268435456);
            CropActivity.this.startActivityForResult(intent, 101);
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$m */
    class C6837m implements DialogInterface.OnClickListener {
        C6837m(CropActivity cropActivity) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$n */
    class C6838n implements DialogInterface.OnClickListener {
        C6838n() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            CropActivity.this.setResult(0);
            CropActivity.this.finish();
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$o */
    class C6839o implements Runnable {
        C6839o() {
        }

        public void run() {
            try {
                if (CropActivity.this.f30455W != CropActivity.this.f30458Y) {
                    CropActivity cropActivity = CropActivity.this;
                    int unused = cropActivity.f30458Y = cropActivity.f30455W;
                }
                if (CropActivity.this.f30457X != CropActivity.this.f30459Z) {
                    CropActivity cropActivity2 = CropActivity.this;
                    int unused2 = cropActivity2.f30459Z = cropActivity2.f30457X;
                }
                CropActivity.this.f30482w0.postDelayed(CropActivity.this.f30456W0, 100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$p */
    class C6840p implements DialogInterface.OnCancelListener {
        C6840p() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            boolean unused = CropActivity.this.f30411A = false;
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$q */
    class C6841q implements C7284d.C7286b {
        C6841q() {
        }

        /* renamed from: a */
        public boolean mo26574a(double d) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - CropActivity.this.f30485z > 100) {
                CropActivity.this.f30413B.setProgress((int) (((double) CropActivity.this.f30413B.getMax()) * d));
                long unused = CropActivity.this.f30485z = currentTimeMillis;
            }
            return CropActivity.this.f30411A;
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$r */
    class C6842r extends Thread {
        C6842r() {
        }

        public void run() {
            try {
                CropActivity cropActivity = CropActivity.this;
                boolean unused = cropActivity.f30467h0 = C7290g.m41352a(cropActivity.getPreferences(0));
                if (!CropActivity.this.f30417D.getAbsolutePath().toLowerCase().contains(".amr") || CropActivity.this.f30445R == null) {
                    MediaPlayer unused2 = CropActivity.this.f30466g0 = new MediaPlayer();
                    CropActivity.this.f30466g0.setDataSource(CropActivity.this.f30417D.getAbsolutePath());
                    CropActivity.this.f30466g0.setAudioStreamType(3);
                    CropActivity.this.f30466g0.prepare();
                    return;
                }
                Uri contentUriForPath = MediaStore.Audio.Media.getContentUriForPath(CropActivity.this.f30417D.getAbsolutePath());
                CropActivity cropActivity2 = CropActivity.this;
                MediaPlayer unused3 = cropActivity2.f30466g0 = MediaPlayer.create(cropActivity2, Uri.withAppendedPath(contentUriForPath, cropActivity2.f30445R));
            } catch (Exception e) {
                boolean unused4 = CropActivity.this.f30418D0 = true;
                e.printStackTrace();
            }
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$s */
    class C6843s extends Thread {

        /* renamed from: g */
        final /* synthetic */ C7284d.C7286b f30513g;

        /* renamed from: coocent.music.player.activity.CropActivity$s$a */
        class C6844a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ String f30515g;

            C6844a(String str) {
                this.f30515g = str;
            }

            public void run() {
                CropActivity cropActivity = CropActivity.this;
                cropActivity.m38833D3(cropActivity.getResources().getString(R.string.unsupportedExtension), this.f30515g, new Exception());
            }
        }

        /* renamed from: coocent.music.player.activity.CropActivity$s$b */
        class C6845b implements Runnable {

            /* renamed from: g */
            final /* synthetic */ Exception f30517g;

            C6845b(Exception exc) {
                this.f30517g = exc;
            }

            public void run() {
                CropActivity cropActivity = CropActivity.this;
                cropActivity.m38833D3(cropActivity.getResources().getString(R.string.ReadError), CropActivity.this.getResources().getString(R.string.read_error), this.f30517g);
            }
        }

        /* renamed from: coocent.music.player.activity.CropActivity$s$c */
        class C6846c implements Runnable {
            C6846c() {
            }

            public void run() {
                CropActivity.this.m38920v3();
            }
        }

        C6843s(C7284d.C7286b bVar) {
            this.f30513g = bVar;
        }

        public void run() {
            String str;
            try {
                CropActivity cropActivity = CropActivity.this;
                C7284d unused = cropActivity.f30415C = C7284d.m41327c(cropActivity.f30417D.getAbsolutePath(), this.f30513g);
                if (CropActivity.this.f30415C == null) {
                    boolean unused2 = CropActivity.this.f30418D0 = true;
                    CropActivity.this.f30413B.dismiss();
                    String[] split = CropActivity.this.f30417D.getName().toLowerCase().split("\\.");
                    if (split.length < 2) {
                        str = CropActivity.this.getResources().getString(R.string.no_extension_error);
                    } else {
                        str = CropActivity.this.getResources().getString(R.string.bad_extension_error) + " " + split[split.length - 1];
                    }
                    CropActivity.this.f30482w0.post(new C6844a(str));
                    return;
                }
                CropActivity.this.f30413B.dismiss();
                if (CropActivity.this.f30411A) {
                    CropActivity.this.f30482w0.post(new C6846c());
                    return;
                }
                CropActivity.this.setResult(0);
                CropActivity.this.finish();
            } catch (Exception e) {
                try {
                    boolean unused3 = CropActivity.this.f30418D0 = true;
                    CropActivity.this.f30413B.dismiss();
                    e.printStackTrace();
                    CropActivity.this.f30482w0.post(new C6845b(e));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$t */
    class C6847t extends Thread {

        /* renamed from: g */
        final /* synthetic */ File f30520g;

        /* renamed from: h */
        final /* synthetic */ int f30521h;

        /* renamed from: i */
        final /* synthetic */ int f30522i;

        /* renamed from: j */
        final /* synthetic */ String f30523j;

        /* renamed from: k */
        final /* synthetic */ CharSequence f30524k;

        /* renamed from: l */
        final /* synthetic */ int f30525l;

        /* renamed from: coocent.music.player.activity.CropActivity$t$a */
        class C6848a implements C7284d.C7286b {
            C6848a(C6847t tVar) {
            }

            /* renamed from: a */
            public boolean mo26574a(double d) {
                return true;
            }
        }

        /* renamed from: coocent.music.player.activity.CropActivity$t$b */
        class C6849b implements Runnable {

            /* renamed from: g */
            final /* synthetic */ CharSequence f30527g;

            /* renamed from: h */
            final /* synthetic */ Exception f30528h;

            C6849b(CharSequence charSequence, Exception exc) {
                this.f30527g = charSequence;
                this.f30528h = exc;
            }

            public void run() {
                CropActivity cropActivity = CropActivity.this;
                cropActivity.m38833D3(cropActivity.getResources().getString(R.string.write_error), this.f30527g, this.f30528h);
            }
        }

        /* renamed from: coocent.music.player.activity.CropActivity$t$c */
        class C6850c implements Runnable {
            C6850c() {
            }

            public void run() {
                C6847t tVar = C6847t.this;
                CropActivity.this.m38907o3(tVar.f30524k, tVar.f30523j, tVar.f30520g, tVar.f30525l);
                CropActivity.this.onBackPressed();
            }
        }

        C6847t(File file, int i, int i2, String str, CharSequence charSequence, int i3) {
            this.f30520g = file;
            this.f30521h = i;
            this.f30522i = i2;
            this.f30523j = str;
            this.f30524k = charSequence;
            this.f30525l = i3;
        }

        public void run() {
            Exception exc;
            String str;
            try {
                C7284d Z2 = CropActivity.this.f30415C;
                File file = this.f30520g;
                int i = this.f30521h;
                Z2.mo27947b(file, i, this.f30522i - i);
                C7284d.m41327c(this.f30523j, new C6848a(this));
                CropActivity.this.f30482w0.post(new C6850c());
            } catch (Exception e) {
                try {
                    boolean unused = CropActivity.this.f30418D0 = true;
                    CropActivity.this.f30413B.dismiss();
                    if (e.getMessage().equals("No space left on device")) {
                        str = CropActivity.this.getResources().getString(R.string.no_space_error);
                        exc = null;
                    } else {
                        exc = e;
                        str = CropActivity.this.getResources().getString(R.string.write_error);
                    }
                    CropActivity.this.f30482w0.post(new C6849b(str, exc));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$u */
    class C6851u implements Runnable {
        C6851u() {
        }

        public void run() {
            CropActivity.this.m38888e4(true);
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$v */
    class C6852v implements TextWatcher {
        C6852v() {
        }

        public void afterTextChanged(Editable editable) {
            boolean unused = CropActivity.this.f30418D0 = false;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence == null || TextUtils.isEmpty(charSequence) || !CropActivity.this.f30425H.mo27923g() || !CropActivity.this.f30420E0) {
                boolean unused = CropActivity.this.f30418D0 = true;
            } else if (CropActivity.this.f30457X < CropActivity.this.f30455W) {
                CropActivity cropActivity = CropActivity.this;
                int unused2 = cropActivity.f30455W = cropActivity.f30457X;
                CropActivity cropActivity2 = CropActivity.this;
                double unused3 = cropActivity2.f30414B0 = cropActivity2.m38829B3(cropActivity2.f30455W);
                boolean unused4 = CropActivity.this.f30418D0 = true;
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence != null && !TextUtils.isEmpty(charSequence) && CropActivity.this.f30425H.mo27923g() && CropActivity.this.f30420E0) {
                if (CropActivity.this.f30418D0) {
                    boolean unused = CropActivity.this.f30418D0 = false;
                    return;
                }
                String charSequence2 = charSequence.toString();
                int length = charSequence2.length() - 1;
                if (charSequence2.contains(".")) {
                    int indexOf = charSequence2.indexOf(".");
                    StringBuilder sb = new StringBuilder();
                    boolean unused2 = CropActivity.this.f30418D0 = true;
                    if (indexOf == 0) {
                        sb.append("0.");
                        if (length == 0) {
                            sb.append("0");
                            charSequence2 = sb.toString();
                        } else if (length >= 1) {
                            sb.append(charSequence2.substring(1, 2));
                            charSequence2 = sb.toString();
                        } else {
                            charSequence2 = BuildConfig.FLAVOR;
                        }
                    } else if (indexOf == length) {
                        sb.append(charSequence2);
                        sb.append("0");
                        charSequence2 = sb.toString();
                    }
                    if ((charSequence2.length() - 1) - indexOf > 1) {
                        boolean unused3 = CropActivity.this.f30418D0 = false;
                    }
                    CropActivity cropActivity = CropActivity.this;
                    double unused4 = cropActivity.f30416C0 = cropActivity.m38928z3(charSequence2);
                } else {
                    boolean unused5 = CropActivity.this.f30418D0 = true;
                    if (charSequence2.equals(BuildConfig.FLAVOR)) {
                        double unused6 = CropActivity.this.f30416C0 = 15.0d;
                    } else {
                        CropActivity cropActivity2 = CropActivity.this;
                        double unused7 = cropActivity2.f30416C0 = cropActivity2.m38928z3(charSequence2);
                    }
                }
                CropActivity cropActivity3 = CropActivity.this;
                int unused8 = cropActivity3.f30457X = cropActivity3.f30425H.mo27934n(CropActivity.this.f30416C0);
                if (CropActivity.this.f30457X > CropActivity.this.f30453V) {
                    CropActivity cropActivity4 = CropActivity.this;
                    int unused9 = cropActivity4.f30457X = cropActivity4.f30453V;
                    CropActivity cropActivity5 = CropActivity.this;
                    double unused10 = cropActivity5.f30416C0 = cropActivity5.m38829B3(cropActivity5.f30457X);
                }
                CropActivity.this.m38888e4(true);
            }
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$w */
    class C6853w implements C7292h.C7294b {
        C6853w() {
        }

        /* renamed from: a */
        public void mo26587a(int i) {
            InputMethodManager inputMethodManager = (InputMethodManager) CropActivity.this.getSystemService("input_method");
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(CropActivity.this.getWindow().getDecorView().getWindowToken(), 0);
                CropActivity.this.f30486z0.clearFocus();
                CropActivity.this.f30412A0.clearFocus();
            }
            if (CropActivity.this.f30457X < CropActivity.this.f30455W) {
                CropActivity cropActivity = CropActivity.this;
                int unused = cropActivity.f30457X = cropActivity.f30455W;
                CropActivity.this.m38866U3();
                CropActivity cropActivity2 = CropActivity.this;
                double unused2 = cropActivity2.f30416C0 = cropActivity2.m38829B3(cropActivity2.f30455W);
                CropActivity.this.f30425H.setLineStart(false);
                CropActivity.this.f30429J.requestFocus();
                boolean unused3 = CropActivity.this.f30418D0 = false;
                CropActivity.this.m38888e4(true);
                C8344t.m46317e(C8345u.m46327h(), CropActivity.this.getString(R.string.end_big));
            }
        }

        /* renamed from: b */
        public void mo26588b(int i) {
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$x */
    class C6854x extends C7970w {
        C6854x() {
        }

        /* renamed from: i */
        public void mo26589i() {
            super.mo26589i();
            CropActivity.this.mo26526P3();
        }

        /* renamed from: j */
        public void mo26590j() {
            super.mo26590j();
            CropActivity.this.m38853N3();
        }

        /* renamed from: t */
        public void mo26591t() {
            CropActivity.this.finish();
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$y */
    class C6855y extends Handler {
        C6855y() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1001) {
                int unused = CropActivity.this.f30426H0 = 2;
                boolean unused2 = CropActivity.this.f30428I0 = false;
            }
            super.handleMessage(message);
        }
    }

    /* renamed from: coocent.music.player.activity.CropActivity$z */
    class C6856z implements View.OnClickListener {
        C6856z() {
        }

        public void onClick(View view) {
            boolean unused = CropActivity.this.f30418D0 = false;
            CropActivity.this.f30425H.mo27938p();
            CropActivity cropActivity = CropActivity.this;
            int unused2 = cropActivity.f30455W = cropActivity.f30425H.getStart();
            CropActivity cropActivity2 = CropActivity.this;
            int unused3 = cropActivity2.f30457X = cropActivity2.f30425H.getEnd();
            CropActivity cropActivity3 = CropActivity.this;
            int unused4 = cropActivity3.f30453V = cropActivity3.f30425H.mo27928h();
            CropActivity cropActivity4 = CropActivity.this;
            int unused5 = cropActivity4.f30460a0 = cropActivity4.f30425H.getOffset();
            CropActivity cropActivity5 = CropActivity.this;
            int unused6 = cropActivity5.f30461b0 = cropActivity5.f30460a0;
            CropActivity.this.m38918u3();
            CropActivity.this.m38888e4(true);
        }
    }

    static {
        float f = C7397j.f32506c;
        f30409Z0 = (int) (30.0f * f);
        f30410a1 = (int) (f * 15.0f);
    }

    /* renamed from: A3 */
    private boolean m38827A3() {
        this.f30466g0 = null;
        this.f30415C = null;
        this.f30419E = getIntent().getData().toString();
        Bundle bundleExtra = getIntent().getBundleExtra("bundle");
        this.f30447S = getResources().getString(R.string.app_name);
        if (bundleExtra == null) {
            return false;
        }
        this.f30445R = bundleExtra.getString("id");
        this.f30447S = bundleExtra.getString("title");
        bundleExtra.getString("artist");
        bundleExtra.getString("path");
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public double m38829B3(int i) {
        return mo26539p3(Double.valueOf(this.f30425H.mo27931k(i)));
    }

    /* renamed from: C3 */
    private String m38831C3() {
        String str = C7397j.f32507d;
        File file = new File(str);
        file.mkdirs();
        return !file.isDirectory() ? "/sdcard" : str;
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public void m38833D3(CharSequence charSequence, CharSequence charSequence2, Exception exc) {
        this.f30418D0 = true;
        SharedPreferences preferences = getPreferences(0);
        int i = preferences.getInt("error_count", 0);
        SharedPreferences.Editor edit = preferences.edit();
        edit.putInt("error_count", i + 1);
        edit.commit();
        if (preferences.getInt("err_server_allowed", 0) == 1) {
            m38880b4(exc, charSequence2);
        } else if (i < preferences.getInt("err_server_check", 1)) {
            m38880b4(exc, charSequence2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public synchronized void m38835E3() {
        MediaPlayer mediaPlayer = this.f30466g0;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.f30466g0.pause();
        }
        WaveformView waveformView = this.f30425H;
        if (waveformView != null) {
            waveformView.setPlayback(-1);
        }
        this.f30465f0 = false;
        m38916t3();
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public void m38837F3(Uri uri) {
        String string = getString(R.string.artist_name);
        String str = BuildConfig.FLAVOR;
        String uri2 = uri != null ? uri.toString() : str;
        String substring = uri2.substring(uri2.lastIndexOf("/") + 1, uri2.length());
        C7289f fVar = new C7289f();
        fVar.setID(substring);
        fVar.setMusic(true);
        fVar.setPath(this.f30479t0);
        fVar.setTitle(this.f30478s0);
        fVar.setDisplayName(this.f30478s0 + this.f30423G);
        fVar.setDuration(this.f30480u0);
        Log.e("time", "newDuration:" + this.f30480u0);
        fVar.setArist(string);
        fVar.setAlbum("RingToneCutter");
        getResources().getString(R.string.home_setup_phone);
        getResources().getString(R.string.home_setup_notification);
        getResources().getString(R.string.home_setup_alarm);
        getResources().getString(R.string.home_setup_contact);
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_ringtone", 0);
        contentValues.put("is_notification", 0);
        contentValues.put("is_alarm", 0);
        contentValues.put("is_music", 1);
        getContentResolver().update(uri, contentValues, "_id=?", new String[]{substring});
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("duration", Integer.valueOf(this.f30480u0));
        getContentResolver().update(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, contentValues2, "_id=?", new String[]{String.valueOf(substring)});
        fVar.setRingTone(this.f30481v0 == 0);
        fVar.setNotification(this.f30481v0 == 1);
        fVar.setAlarm(this.f30481v0 == 2);
        fVar.setContact(this.f30481v0 == 3);
        int i = this.f30481v0;
        fVar.setMusic(i < 0 || i > 2);
        int i2 = this.f30481v0;
        if (i2 == 0) {
            str = getString(R.string.success_ring);
            C7296j.m41366c(this, uri);
        } else if (i2 == 1) {
            str = getString(R.string.success_notify);
            C7296j.m41365b(this, uri);
        } else if (i2 == 2) {
            str = getString(R.string.success_alarm);
            C7296j.m41364a(this, uri);
        } else if (i2 == 3) {
            str = getString(R.string.success_contact).replace("$contact", this.f30476q0);
        }
        Intent intent = new Intent(C8311c.f34734a);
        Intent intent2 = new Intent(C8311c.f34735b);
        sendBroadcast(intent);
        sendBroadcast(intent2);
        new C8337n(this).mo30222k2(4);
        Intent intent3 = new Intent(this, LibraryActivity.class);
        intent3.putExtra("fromCutter", true);
        startActivity(intent3);
        Toast.makeText(this, getResources().getString(R.string.crop_save_success) + str.replace("$ring", fVar.getTitle()), 0).show();
        this.f30476q0 = null;
        this.f30475p0 = null;
        this.f30481v0 = -1;
    }

    /* renamed from: G3 */
    private void m38839G3() {
        this.f30436M0 = new C6825d0(this, (C6835k) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT");
        registerReceiver(this.f30436M0, intentFilter);
    }

    /* renamed from: H3 */
    private void m38841H3() {
        setContentView((int) R.layout.cropped2);
        this.f30473n0 = C7397j.f32506c;
        this.f30474o0 = (DeepCropTitle) findViewById(R.id.deepTitle);
        this.f30432K0 = (ImageView) findViewById(R.id.iv_bg);
        this.f30438N0 = findViewById(R.id.color_bg);
        ImageButton imageButton = (ImageButton) findViewById(R.id.cropPlay);
        this.f30433L = imageButton;
        imageButton.setOnClickListener(this.f30446R0);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.cropPrevious);
        this.f30435M = imageButton2;
        imageButton2.setOnClickListener(this.f30448S0);
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.cropNext);
        this.f30437N = imageButton3;
        imageButton3.setOnClickListener(this.f30450T0);
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.cropZoomIn);
        this.f30439O = imageButton4;
        imageButton4.setOnClickListener(this.f30442P0);
        ImageButton imageButton5 = (ImageButton) findViewById(R.id.cropZoomOut);
        this.f30441P = imageButton5;
        imageButton5.setOnClickListener(this.f30444Q0);
        this.f30434L0 = (RelativeLayout) findViewById(R.id.bottom_control);
        TextView textView = (TextView) findViewById(R.id.track_name);
        this.f30430J0 = textView;
        textView.setText(this.f30447S);
        m38916t3();
        WaveformView waveformView = (WaveformView) findViewById(R.id.waveform);
        this.f30425H = waveformView;
        waveformView.setListener(this);
        this.f30425H.setHandler(this.f30482w0);
        TextView textView2 = (TextView) findViewById(R.id.info);
        this.f30431K = textView2;
        textView2.setText(this.f30449T);
        this.f30453V = 0;
        this.f30458Y = -1;
        this.f30459Z = -1;
        C7284d dVar = this.f30415C;
        if (dVar != null) {
            this.f30425H.setSoundFile(dVar);
            this.f30425H.mo27932l(this.f30473n0);
            this.f30453V = this.f30425H.mo27928h();
        }
        MarkerView markerView = (MarkerView) findViewById(R.id.startmarker);
        this.f30427I = markerView;
        markerView.setListener(this);
        this.f30427I.setAlpha(255);
        this.f30427I.setFocusable(true);
        this.f30427I.setFocusableInTouchMode(true);
        MarkerView markerView2 = (MarkerView) findViewById(R.id.endmarker);
        this.f30429J = markerView2;
        markerView2.setListener(this);
        this.f30429J.setAlpha(255);
        this.f30429J.setFocusable(true);
        this.f30429J.setFocusableInTouchMode(true);
        this.f30484y0 = (TextView) findViewById(R.id.song_time);
        this.f30486z0 = (EditText) findViewById(R.id.start_tv);
        this.f30412A0 = (EditText) findViewById(R.id.end_tv);
        this.f30486z0.setInputType(8194);
        this.f30486z0.addTextChangedListener(new C6835k());
        this.f30412A0.setInputType(8194);
        this.f30412A0.addTextChangedListener(new C6852v());
        C7292h.m41355c(this, new C6853w());
        m38876Z3();
        m38878a4();
        m38888e4(true);
    }

    /* renamed from: I3 */
    private void m38843I3() {
        this.f30417D = new File(this.f30419E);
        String str = this.f30419E;
        this.f30423G = str.substring(str.lastIndexOf(46), this.f30419E.length());
        String str2 = new C7295i(this, this.f30419E).f32228d;
        this.f30421F = str2;
        setTitle(str2);
        this.f30485z = System.currentTimeMillis();
        this.f30411A = true;
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f30413B = progressDialog;
        progressDialog.setProgressStyle(1);
        this.f30413B.setTitle("progress_dialog_loading");
        this.f30413B.setCancelable(false);
        this.f30413B.setOnCancelListener(new C6840p());
        this.f30413B.show();
        C6841q qVar = new C6841q();
        this.f30467h0 = false;
        new C6842r().start();
        new C6843s(qVar).start();
    }

    /* renamed from: J3 */
    private void m38845J3() {
        int i = this.f30461b0;
        int i2 = this.f30460a0;
        int i3 = i - i2;
        int i4 = i3 > 10 ? i3 / 10 : i3 > 0 ? 1 : i3 < -10 ? i3 / 10 : i3 < 0 ? -1 : 0;
        this.f30460a0 = i2 + i4;
        if (i4 == 0) {
            this.f30426H0 = 0;
            this.f30428I0 = false;
        }
    }

    /* renamed from: K3 */
    private String m38847K3(String str, String str2) {
        String str3;
        String str4;
        String str5 = str.toString();
        String C3 = m38831C3();
        int i = 0;
        while (i < 100) {
            if (i > 0) {
                str3 = str + " - Tone" + i;
                str4 = C3 + "/" + str3 + str2;
            } else {
                str3 = str + " - Tone";
                str4 = C3 + "/" + str3 + str2;
            }
            if (!new File(str4).exists()) {
                return str3;
            }
            i++;
            str5 = str3;
        }
        return str5;
    }

    /* renamed from: L3 */
    private void m38849L3(RelativeLayout relativeLayout, boolean z) {
        if (relativeLayout != null) {
            for (int i = 0; i < relativeLayout.getChildCount(); i++) {
                relativeLayout.getChildAt(i).setSelected(z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:25|26|27|28|29) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x009c */
    /* renamed from: M3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m38851M3(int r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            r11.f30418D0 = r0     // Catch:{ all -> 0x00ee }
            boolean r1 = r11.f30465f0     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x000d
            r11.m38835E3()     // Catch:{ all -> 0x00ee }
            monitor-exit(r11)
            return
        L_0x000d:
            android.media.MediaPlayer r1 = r11.f30466g0     // Catch:{ all -> 0x00ee }
            if (r1 != 0) goto L_0x0013
            monitor-exit(r11)
            return
        L_0x0013:
            coocent.music.player.widget.ringtone.WaveformView r1 = r11.f30425H     // Catch:{ Exception -> 0x00dd }
            int r1 = r1.mo27930j(r12)     // Catch:{ Exception -> 0x00dd }
            r11.f30462c0 = r1     // Catch:{ Exception -> 0x00dd }
            int r1 = r11.f30455W     // Catch:{ Exception -> 0x00dd }
            if (r12 >= r1) goto L_0x0028
            coocent.music.player.widget.ringtone.WaveformView r12 = r11.f30425H     // Catch:{ Exception -> 0x00dd }
            int r12 = r12.mo27930j(r1)     // Catch:{ Exception -> 0x00dd }
            r11.f30464e0 = r12     // Catch:{ Exception -> 0x00dd }
            goto L_0x003f
        L_0x0028:
            int r1 = r11.f30457X     // Catch:{ Exception -> 0x00dd }
            if (r12 <= r1) goto L_0x0037
            coocent.music.player.widget.ringtone.WaveformView r12 = r11.f30425H     // Catch:{ Exception -> 0x00dd }
            int r1 = r11.f30453V     // Catch:{ Exception -> 0x00dd }
            int r12 = r12.mo27930j(r1)     // Catch:{ Exception -> 0x00dd }
            r11.f30464e0 = r12     // Catch:{ Exception -> 0x00dd }
            goto L_0x003f
        L_0x0037:
            coocent.music.player.widget.ringtone.WaveformView r12 = r11.f30425H     // Catch:{ Exception -> 0x00dd }
            int r12 = r12.mo27930j(r1)     // Catch:{ Exception -> 0x00dd }
            r11.f30464e0 = r12     // Catch:{ Exception -> 0x00dd }
        L_0x003f:
            r11.f30463d0 = r0     // Catch:{ Exception -> 0x00dd }
            coocent.music.player.widget.ringtone.WaveformView r12 = r11.f30425H     // Catch:{ Exception -> 0x00dd }
            int r1 = r11.f30462c0     // Catch:{ Exception -> 0x00dd }
            double r1 = (double) r1     // Catch:{ Exception -> 0x00dd }
            r3 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            double r1 = r1 * r3
            int r12 = r12.mo27933m(r1)     // Catch:{ Exception -> 0x00dd }
            coocent.music.player.widget.ringtone.WaveformView r1 = r11.f30425H     // Catch:{ Exception -> 0x00dd }
            int r2 = r11.f30464e0     // Catch:{ Exception -> 0x00dd }
            double r5 = (double) r2     // Catch:{ Exception -> 0x00dd }
            double r5 = r5 * r3
            int r1 = r1.mo27933m(r5)     // Catch:{ Exception -> 0x00dd }
            coocent.music.player.widget.ringtone.d r2 = r11.f30415C     // Catch:{ Exception -> 0x00dd }
            int r12 = r2.mo27969j(r12)     // Catch:{ Exception -> 0x00dd }
            coocent.music.player.widget.ringtone.d r2 = r11.f30415C     // Catch:{ Exception -> 0x00dd }
            int r1 = r2.mo27969j(r1)     // Catch:{ Exception -> 0x00dd }
            boolean r2 = r11.f30467h0     // Catch:{ Exception -> 0x00dd }
            if (r2 == 0) goto L_0x00b8
            if (r12 < 0) goto L_0x00b8
            if (r1 < 0) goto L_0x00b8
            r2 = 3
            android.media.MediaPlayer r3 = r11.f30466g0     // Catch:{ Exception -> 0x009c }
            r3.reset()     // Catch:{ Exception -> 0x009c }
            android.media.MediaPlayer r3 = r11.f30466g0     // Catch:{ Exception -> 0x009c }
            r3.setAudioStreamType(r2)     // Catch:{ Exception -> 0x009c }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x009c }
            java.io.File r4 = r11.f30417D     // Catch:{ Exception -> 0x009c }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ Exception -> 0x009c }
            r3.<init>(r4)     // Catch:{ Exception -> 0x009c }
            android.media.MediaPlayer r5 = r11.f30466g0     // Catch:{ Exception -> 0x009c }
            java.io.FileDescriptor r6 = r3.getFD()     // Catch:{ Exception -> 0x009c }
            long r7 = (long) r12     // Catch:{ Exception -> 0x009c }
            int r1 = r1 - r12
            long r9 = (long) r1     // Catch:{ Exception -> 0x009c }
            r5.setDataSource(r6, r7, r9)     // Catch:{ Exception -> 0x009c }
            android.media.MediaPlayer r12 = r11.f30466g0     // Catch:{ Exception -> 0x009c }
            r12.prepare()     // Catch:{ Exception -> 0x009c }
            int r12 = r11.f30462c0     // Catch:{ Exception -> 0x009c }
            r11.f30463d0 = r12     // Catch:{ Exception -> 0x009c }
            goto L_0x00b8
        L_0x009c:
            android.media.MediaPlayer r12 = r11.f30466g0     // Catch:{ Exception -> 0x00dd }
            r12.reset()     // Catch:{ Exception -> 0x00dd }
            android.media.MediaPlayer r12 = r11.f30466g0     // Catch:{ Exception -> 0x00dd }
            r12.setAudioStreamType(r2)     // Catch:{ Exception -> 0x00dd }
            android.media.MediaPlayer r12 = r11.f30466g0     // Catch:{ Exception -> 0x00dd }
            java.io.File r1 = r11.f30417D     // Catch:{ Exception -> 0x00dd }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x00dd }
            r12.setDataSource(r1)     // Catch:{ Exception -> 0x00dd }
            android.media.MediaPlayer r12 = r11.f30466g0     // Catch:{ Exception -> 0x00dd }
            r12.prepare()     // Catch:{ Exception -> 0x00dd }
            r11.f30463d0 = r0     // Catch:{ Exception -> 0x00dd }
        L_0x00b8:
            android.media.MediaPlayer r12 = r11.f30466g0     // Catch:{ Exception -> 0x00dd }
            coocent.music.player.activity.CropActivity$c r0 = new coocent.music.player.activity.CropActivity$c     // Catch:{ Exception -> 0x00dd }
            r0.<init>()     // Catch:{ Exception -> 0x00dd }
            r12.setOnCompletionListener(r0)     // Catch:{ Exception -> 0x00dd }
            r12 = 1
            r11.f30465f0 = r12     // Catch:{ Exception -> 0x00dd }
            int r0 = r11.f30463d0     // Catch:{ Exception -> 0x00dd }
            if (r0 != 0) goto L_0x00d0
            android.media.MediaPlayer r0 = r11.f30466g0     // Catch:{ Exception -> 0x00dd }
            int r1 = r11.f30462c0     // Catch:{ Exception -> 0x00dd }
            r0.seekTo(r1)     // Catch:{ Exception -> 0x00dd }
        L_0x00d0:
            android.media.MediaPlayer r0 = r11.f30466g0     // Catch:{ Exception -> 0x00dd }
            r0.start()     // Catch:{ Exception -> 0x00dd }
            r11.m38888e4(r12)     // Catch:{ Exception -> 0x00dd }
            r11.m38916t3()     // Catch:{ Exception -> 0x00dd }
            monitor-exit(r11)
            return
        L_0x00dd:
            r12 = move-exception
            android.content.res.Resources r0 = r11.getResources()     // Catch:{ all -> 0x00ee }
            r1 = 2131821139(0x7f110253, float:1.9275013E38)
            java.lang.String r0 = r0.getString(r1)     // Catch:{ all -> 0x00ee }
            r11.m38880b4(r12, r0)     // Catch:{ all -> 0x00ee }
            monitor-exit(r11)
            return
        L_0x00ee:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: coocent.music.player.activity.CropActivity.m38851M3(int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public void m38853N3() {
        int i = this.f30455W;
        int i2 = 0;
        if (i == 0 && this.f30457X == this.f30453V) {
            Toast.makeText(getApplicationContext(), R.string.crop_no_crop, 0).show();
        } else if (i == this.f30457X) {
            Toast.makeText(getApplicationContext(), R.string.crop_no_crop, 0).show();
        } else {
            if (this.f30465f0) {
                m38835E3();
            }
            this.f30481v0 = -1;
            View inflate = LayoutInflater.from(getApplicationContext()).inflate(R.layout.dialog_save_crop2, (ViewGroup) null);
            EditText editText = (EditText) inflate.findViewById(R.id.titleEdit);
            String K3 = m38847K3(this.f30421F, this.f30423G);
            this.f30478s0 = K3;
            editText.setText(K3);
            String str = this.f30478s0;
            if (str != null) {
                i2 = str.length();
            }
            editText.setSelection(i2);
            editText.setFocusable(true);
            editText.setFocusableInTouchMode(true);
            editText.requestFocus();
            AlertDialog create = new AlertDialog.Builder(this).setTitle(R.string.save_title).setView(inflate).create();
            create.setOnShowListener(new C6824d(this, editText));
            create.show();
            inflate.findViewById(R.id.phoneLayout).setOnClickListener(new C6826e());
            inflate.findViewById(R.id.notifyLayout).setOnClickListener(new C6829f());
            inflate.findViewById(R.id.alarmLayout).setOnClickListener(new C6830g());
            inflate.findViewById(R.id.contactLayout).setOnClickListener(new C6831h(this));
            inflate.findViewById(R.id.tv_cancel).setOnClickListener(new C6832i(this, create));
            inflate.findViewById(R.id.tv_ok).setOnClickListener(new C6833j(editText));
        }
    }

    /* renamed from: O3 */
    private void m38855O3() {
        this.f30455W = this.f30425H.mo27934n(0.0d);
        int n = this.f30425H.mo27934n(15.0d);
        this.f30457X = n;
        int i = this.f30453V;
        if (n > i) {
            this.f30457X = i;
        }
        Log.d("onTextChanged: ===", this.f30455W + "==" + this.f30457X);
        this.f30414B0 = m38829B3(this.f30455W);
        this.f30416C0 = m38829B3(this.f30457X);
        this.f30418D0 = false;
    }

    /* renamed from: Q3 */
    private void m38858Q3(CharSequence charSequence) {
        String str = m38831C3() + File.separator + charSequence.toString() + this.f30423G;
        File file = new File(str);
        if (file.exists()) {
            Toast.makeText(getApplicationContext(), R.string.crop_title_repeat, 0).show();
            return;
        }
        double k = this.f30425H.mo27931k(this.f30455W);
        Log.e("time", "startTime:" + k);
        double k2 = this.f30425H.mo27931k(this.f30457X);
        Log.e("time", "endTime:" + k2);
        int m = this.f30425H.mo27933m(k);
        Log.e("time", "startFrame:" + m);
        int m2 = this.f30425H.mo27933m(k2);
        Log.e("time", "endFrame:" + m2);
        int i = ((int) ((k2 - k) + 0.5d)) * 1000;
        Log.e("time", "duration:" + i);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f30413B = progressDialog;
        progressDialog.setProgressStyle(0);
        this.f30413B.setTitle(getResources().getString(R.string.crop_saving));
        this.f30413B.setIndeterminate(true);
        this.f30413B.setCancelable(false);
        this.f30413B.show();
        new C6847t(file, m, m2, str, charSequence, i).start();
    }

    /* renamed from: R3 */
    private void m38860R3(boolean z) {
        if (!this.f30465f0) {
            C8344t.m46317e(C8345u.m46327h(), getString(R.string.play_click));
            return;
        }
        int i = this.f30425H.mo27929i(this.f30466g0.getCurrentPosition() + this.f30463d0);
        if (z) {
            if (i < this.f30457X) {
                this.f30455W = i;
                m38872X3();
                this.f30414B0 = m38829B3(i);
                Log.d("setCurrentPos: ", this.f30414B0 + "==" + this.f30455W);
                this.f30425H.setLineStart(true);
                this.f30427I.requestFocus();
            } else {
                C8344t.m46317e(C8345u.m46327h(), getString(R.string.greater_start));
            }
        } else if (i > this.f30455W) {
            this.f30457X = i;
            m38866U3();
            this.f30416C0 = m38829B3(i);
            if (this.f30465f0) {
                m38835E3();
            }
            this.f30425H.setLineStart(false);
            this.f30429J.requestFocus();
        } else {
            C8344t.m46317e(C8345u.m46327h(), getString(R.string.less_start));
        }
        this.f30418D0 = false;
        m38888e4(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public void m38862S3(int i) {
        RelativeLayout relativeLayout = this.f30434L0;
        if (relativeLayout != null) {
            relativeLayout.setPadding(relativeLayout.getPaddingLeft(), this.f30434L0.getPaddingTop(), this.f30434L0.getPaddingRight(), i);
        }
    }

    /* renamed from: T3 */
    private void m38864T3(int i) {
        m38870W3(i);
        m38888e4(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public void m38866U3() {
        m38864T3(this.f30457X - (this.f30451U / 2));
    }

    /* renamed from: V3 */
    private void m38868V3() {
        m38870W3(this.f30457X - (this.f30451U / 2));
    }

    /* renamed from: W3 */
    private void m38870W3(int i) {
        if (!this.f30468i0) {
            this.f30461b0 = i;
            int i2 = this.f30451U;
            int i3 = i + (i2 / 2);
            int i4 = this.f30453V;
            if (i3 > i4) {
                this.f30461b0 = i4 - (i2 / 2);
            }
            if (this.f30461b0 < 0) {
                this.f30461b0 = 0;
            }
        }
    }

    /* renamed from: X3 */
    private void m38872X3() {
        m38864T3(this.f30455W - (this.f30451U / 2));
    }

    /* renamed from: Y3 */
    private void m38874Y3() {
        m38870W3(this.f30455W - (this.f30451U / 2));
    }

    /* renamed from: Z3 */
    private void m38876Z3() {
        this.f30474o0.setAddStatusHeight(true);
        this.f30474o0.setTitleText(this.f30447S);
        this.f30432K0.setImageDrawable(C9332d.m49407d(this, R.drawable.splash_skin_1_bg_shape));
    }

    /* renamed from: a4 */
    private void m38878a4() {
        this.f30474o0.setCropTitleOnClickListener(new C6854x());
    }

    /* renamed from: b4 */
    private void m38880b4(Exception exc, CharSequence charSequence) {
        String str;
        this.f30418D0 = true;
        if (exc != null) {
            str = getResources().getString(R.string.fail);
            setResult(0, new Intent());
        } else {
            str = getResources().getString(R.string.success);
        }
        new AlertDialog.Builder(this).setTitle(str).setMessage(charSequence).setPositiveButton(getResources().getString(R.string.main_ok), new C6838n()).setCancelable(false).show();
    }

    /* renamed from: c4 */
    private int m38882c4(int i) {
        if (i < 0) {
            return 0;
        }
        int i2 = this.f30453V;
        return i > i2 ? i2 : i;
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public void m38883d2(RelativeLayout relativeLayout, int i) {
        m38849L3(relativeLayout, !(this.f30481v0 == i));
        if (this.f30481v0 == i) {
            this.f30452U0 = null;
            this.f30481v0 = -1;
            return;
        }
        m38849L3(this.f30452U0, false);
        this.f30452U0 = relativeLayout;
        this.f30481v0 = i;
    }

    /* renamed from: d4 */
    private double m38885d4(double d) {
        if (d < 0.0d) {
            return 0.0d;
        }
        double p3 = mo26539p3(Double.valueOf(this.f30425H.mo27931k(this.f30453V)));
        if (d > p3) {
            return p3;
        }
        return mo26539p3(Double.valueOf(d));
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public synchronized void m38888e4(boolean z) {
        int i;
        if (this.f30465f0) {
            int currentPosition = this.f30466g0.getCurrentPosition() + this.f30463d0;
            int i2 = this.f30425H.mo27929i(currentPosition);
            this.f30425H.setPlayback(i2);
            m38870W3(i2 - (this.f30451U / 2));
            if (currentPosition >= this.f30464e0) {
                m38835E3();
            }
        }
        if (!this.f30468i0 && this.f30465f0 && ((i = this.f30426H0) == 0 || i == 2)) {
            if (i == 0) {
                this.f30426H0 = 1;
            }
            int i3 = this.f30426H0;
            if (i3 == 1 && !this.f30428I0) {
                this.f30428I0 = true;
                this.f30440O0.removeCallbacksAndMessages((Object) null);
                this.f30440O0.sendEmptyMessageDelayed(1001, 5000);
            } else if (i3 == 2) {
                m38845J3();
            }
        }
        if (f30408Y0 == 0) {
            f30407X0 = 0;
            f30408Y0 = this.f30427I.getWidth();
        }
        this.f30425H.mo27935o(this.f30455W, this.f30457X, this.f30460a0, this.f30427I.getWidth() / 2);
        this.f30425H.invalidate();
        int i4 = (this.f30455W - this.f30460a0) - f30407X0;
        if (this.f30427I.getWidth() + i4 >= 0) {
            this.f30427I.setAlpha(255);
        } else {
            this.f30427I.setAlpha(0);
            i4 = 0;
        }
        int width = ((this.f30457X - this.f30460a0) - this.f30429J.getWidth()) + f30408Y0;
        if (this.f30429J.getWidth() + width >= 0) {
            this.f30429J.setAlpha(255);
        } else {
            this.f30429J.setAlpha(0);
            width = 0;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(i4, f30409Z0, 0, 0);
        this.f30427I.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(width, (this.f30425H.getMeasuredHeight() - this.f30429J.getHeight()) - f30410a1, width > 630 ? -(width - 630) : 0, 0);
        this.f30429J.setLayoutParams(layoutParams2);
        if (z) {
            if (!this.f30418D0) {
                this.f30418D0 = true;
                this.f30486z0.setText(this.f30414B0 + BuildConfig.FLAVOR);
                this.f30412A0.setText(this.f30416C0 + BuildConfig.FLAVOR);
            }
            this.f30484y0.setText(m38926y3(this.f30457X - this.f30455W));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public void m38907o3(CharSequence charSequence, String str, File file, int i) {
        String string = getString(R.string.artist_name);
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
        } catch (IOException | C9015a | C9017c | C9018d | C9022h | C9131k unused) {
            this.f30418D0 = true;
        }
        this.f30413B.dismiss();
        this.f30479t0 = str;
        this.f30480u0 = i;
        MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(getApplicationContext(), new C6827e0(str));
        this.f30477r0 = mediaScannerConnection;
        mediaScannerConnection.connect();
        this.f30483x0 = true;
    }

    /* renamed from: q3 */
    private void m38910q3(boolean z) {
        boolean z2 = false;
        this.f30418D0 = false;
        if (this.f30455W == this.f30457X) {
            z2 = true;
        }
        double d = -0.1d;
        if (!z2) {
            m38885d4(this.f30416C0 + (z ? 0.1d : -0.1d));
        } else if (z) {
            m38885d4(this.f30416C0 + 0.1d);
        }
        double d2 = this.f30416C0;
        if (z2 || z) {
            d = 0.1d;
        }
        this.f30416C0 = m38885d4(d2 + d);
        this.f30412A0.setText(this.f30416C0 + BuildConfig.FLAVOR);
        int n = this.f30425H.mo27934n(this.f30416C0);
        this.f30457X = n;
        int i = this.f30453V;
        if (n > i) {
            this.f30457X = i;
        }
        int i2 = this.f30457X;
        int i3 = this.f30455W;
        if (i2 < i3) {
            this.f30457X = i3;
        }
        m38866U3();
        m38888e4(true);
    }

    /* renamed from: r3 */
    private void m38912r3(boolean z) {
        this.f30418D0 = false;
        boolean z2 = this.f30455W == this.f30457X;
        this.f30414B0 = m38885d4(this.f30414B0 + (z ? 0.1d : -0.1d));
        EditText editText = this.f30486z0;
        editText.setText(this.f30414B0 + BuildConfig.FLAVOR);
        int n = this.f30425H.mo27934n(this.f30414B0);
        this.f30455W = n;
        if (n < 0) {
            this.f30455W = 0;
        }
        if (z2) {
            int i = this.f30455W;
            int i2 = this.f30453V;
            if (i > i2) {
                this.f30455W = i2;
            }
            this.f30457X = this.f30455W;
        } else {
            int i3 = this.f30455W;
            int i4 = this.f30457X;
            if (i3 > i4) {
                this.f30455W = i4;
            }
        }
        m38872X3();
        m38888e4(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public void m38914s3(EditText editText) {
        String obj = editText.getText().toString();
        this.f30478s0 = obj;
        if (obj.isEmpty()) {
            Toast.makeText(getApplicationContext(), R.string.crop_title_no_empty, 0).show();
        } else if (!C7397j.m41735e(this.f30478s0)) {
            Toast.makeText(getApplicationContext(), R.string.save_error, 0).show();
        } else {
            int i = this.f30481v0;
            if (i < 0 || i > 2) {
                this.f30481v0 = i;
                m38858Q3(this.f30478s0);
            } else if (Build.VERSION.SDK_INT < 23) {
                this.f30481v0 = i;
                m38858Q3(this.f30478s0);
            } else if (!Settings.System.canWrite(this)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle(R.string.apply_permission_title);
                builder.setMessage(R.string.apply_permission_msg);
                builder.setPositiveButton(17039370, new C6836l());
                builder.setNegativeButton(R.string.cancel, new C6837m(this));
                builder.create().show();
            } else {
                this.f30481v0 = i;
                m38858Q3(this.f30478s0);
            }
        }
    }

    /* renamed from: t3 */
    private void m38916t3() {
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public void m38918u3() {
        this.f30439O.setEnabled(this.f30425H.mo27919a());
        this.f30441P.setEnabled(this.f30425H.mo27920b());
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public void m38920v3() {
        this.f30418D0 = false;
        this.f30425H.setSoundFile(this.f30415C);
        this.f30425H.mo27932l(this.f30473n0);
        this.f30453V = this.f30425H.mo27928h();
        this.f30458Y = -1;
        this.f30459Z = -1;
        this.f30468i0 = false;
        this.f30460a0 = 0;
        this.f30461b0 = 0;
        m38855O3();
        int i = this.f30457X;
        int i2 = this.f30453V;
        if (i > i2) {
            this.f30457X = i2;
        }
        String str = this.f30415C.mo27949e() + ", " + this.f30415C.mo27952h() + " Hz, " + this.f30415C.mo27948d() + " kbps, " + m38924x3(this.f30453V) + " ";
        this.f30449T = str;
        this.f30431K.setText(str);
        m38888e4(true);
    }

    /* renamed from: w3 */
    private String m38922w3(double d) {
        int i = (int) (d / 60.0d);
        double p3 = mo26539p3(Double.valueOf(d % 60.0d));
        StringBuffer stringBuffer = new StringBuffer();
        if (i >= 10) {
            stringBuffer.append(i);
        } else {
            stringBuffer.append("0" + i);
        }
        stringBuffer.append(":");
        if (p3 >= 10.0d) {
            stringBuffer.append(p3);
        } else {
            stringBuffer.append("0" + p3);
        }
        return stringBuffer.toString();
    }

    /* renamed from: x3 */
    private String m38924x3(int i) {
        WaveformView waveformView = this.f30425H;
        if (waveformView == null || !waveformView.mo27923g()) {
            this.f30418D0 = true;
            return BuildConfig.FLAVOR;
        }
        int k = (int) this.f30425H.mo27931k(i);
        int i2 = k / 60;
        int i3 = k % 60;
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

    /* renamed from: y3 */
    private String m38926y3(int i) {
        WaveformView waveformView = this.f30425H;
        if (waveformView != null && waveformView.mo27923g()) {
            return m38922w3(this.f30425H.mo27931k(i));
        }
        this.f30418D0 = true;
        return BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public double m38928z3(String str) {
        return mo26539p3(Double.valueOf(str));
    }

    /* renamed from: O0 */
    public void mo26524O0(MarkerView markerView) {
        this.f30443Q = false;
        if (markerView == this.f30427I) {
            m38874Y3();
        } else {
            m38868V3();
        }
        this.f30482w0.postDelayed(new C6851u(), 100);
    }

    /* renamed from: P */
    public void mo26525P(MarkerView markerView, int i) {
        this.f30443Q = true;
        this.f30418D0 = false;
        if (markerView == this.f30427I) {
            int i2 = this.f30455W;
            int i3 = i2 + i;
            this.f30455W = i3;
            int i4 = this.f30453V;
            if (i3 > i4) {
                this.f30455W = i4;
            }
            int i5 = this.f30457X + (this.f30455W - i2);
            this.f30457X = i5;
            if (i5 > i4) {
                this.f30457X = i4;
            }
            m38872X3();
        }
        if (markerView == this.f30429J) {
            int i6 = this.f30457X + i;
            this.f30457X = i6;
            int i7 = this.f30453V;
            if (i6 > i7) {
                this.f30457X = i7;
            }
            m38866U3();
        }
        m38888e4(true);
    }

    /* renamed from: P3 */
    public void mo26526P3() {
        this.f30418D0 = false;
        this.f30455W = this.f30425H.mo27934n(0.0d);
        int n = this.f30425H.mo27934n(15.0d);
        this.f30457X = n;
        int i = this.f30453V;
        if (n > i) {
            this.f30457X = i;
        }
        this.f30414B0 = m38829B3(this.f30455W);
        this.f30416C0 = m38829B3(this.f30457X);
        this.f30418D0 = false;
        this.f30461b0 = 0;
        m38888e4(true);
        Toast.makeText(getApplicationContext(), R.string.crop_reset_success, 0).show();
    }

    /* renamed from: a */
    public void mo26527a(float f, float f2) {
        this.f30468i0 = true;
        this.f30469j0 = f;
        this.f30470k0 = this.f30460a0;
        System.currentTimeMillis();
        this.f30422F0 = f2;
    }

    /* renamed from: a0 */
    public void mo26528a0(MarkerView markerView, float f) {
        this.f30418D0 = false;
        float f2 = f - this.f30469j0;
        if (markerView == this.f30427I) {
            this.f30455W = m38882c4((int) (((float) this.f30471l0) + f2));
            this.f30457X = m38882c4((int) (((float) this.f30472m0) + f2));
        } else {
            int c4 = m38882c4((int) (((float) this.f30472m0) + f2));
            this.f30457X = c4;
            int i = this.f30455W;
            if (c4 < i) {
                this.f30457X = i;
            }
        }
        this.f30414B0 = m38829B3(this.f30455W);
        this.f30416C0 = m38829B3(this.f30457X);
        m38888e4(true);
    }

    public void addEnd(View view) {
        m38910q3(true);
    }

    public void addStart(View view) {
        m38912r3(true);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 66) {
            return super.dispatchKeyEvent(keyEvent);
        }
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager.isActive()) {
            inputMethodManager.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
            this.f30486z0.clearFocus();
            this.f30412A0.clearFocus();
        }
        int i = this.f30457X;
        int i2 = this.f30455W;
        if (i < i2) {
            this.f30457X = i2;
            m38866U3();
            this.f30416C0 = m38829B3(this.f30455W);
            this.f30425H.setLineStart(false);
            this.f30429J.requestFocus();
            this.f30418D0 = false;
            m38888e4(true);
            C8344t.m46317e(C8345u.m46327h(), getString(R.string.end_big));
        }
        return true;
    }

    /* renamed from: g0 */
    public void mo26531g0(MarkerView markerView) {
        this.f30468i0 = false;
        if (markerView == this.f30427I) {
            m38872X3();
        } else {
            m38866U3();
        }
    }

    /* renamed from: h0 */
    public void mo26532h0(MarkerView markerView) {
    }

    /* renamed from: h1 */
    public void mo26533h1(MarkerView markerView, int i) {
        this.f30443Q = true;
        this.f30418D0 = false;
        if (markerView == this.f30427I) {
            int i2 = this.f30455W;
            int c4 = m38882c4(i2 - i);
            this.f30455W = c4;
            this.f30457X = m38882c4(this.f30457X - (i2 - c4));
            m38872X3();
        }
        if (markerView == this.f30429J) {
            int i3 = this.f30457X;
            int i4 = this.f30455W;
            if (i3 == i4) {
                int c42 = m38882c4(i4 - i);
                this.f30455W = c42;
                this.f30457X = c42;
            } else {
                this.f30457X = m38882c4(i3 - i);
            }
            m38866U3();
        }
        m38888e4(true);
    }

    /* renamed from: n */
    public void mo26534n() {
        this.f30451U = this.f30425H.getMeasuredWidth();
        if (this.f30461b0 != this.f30460a0 && !this.f30443Q) {
            m38888e4(false);
        } else if (this.f30465f0) {
            m38888e4(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 101) {
            m38853N3();
        } else if (i2 == 301) {
            if (intent != null) {
                this.f30475p0 = intent.getStringExtra("contactID");
                this.f30476q0 = intent.getStringExtra("contactName");
                String str = this.f30475p0;
                if (str != null && str.length() > 0) {
                    m38849L3((RelativeLayout) this.f30454V0, true);
                    if (this.f30481v0 != 3) {
                        m38849L3(this.f30452U0, false);
                    }
                    this.f30452U0 = (RelativeLayout) this.f30454V0;
                    this.f30481v0 = 3;
                }
            }
        } else if (i2 == -1) {
            this.f30419E = intent.getData().toString();
            this.f30445R = intent.getStringExtra("id");
            if (!this.f30419E.equals("record")) {
                m38843I3();
            }
        }
    }

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("hasCut", this.f30483x0);
        setResult(101, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (BaseApplication.f31159w && BaseApplication.f31158v) {
            getWindow();
        }
        C7397j.m41734d(this);
        if (m38827A3()) {
            m38841H3();
            this.f30482w0.postDelayed(this.f30456W0, 100);
            m38843I3();
        } else {
            C8344t.m46316d(C8345u.m46327h(), R.string.error);
        }
        m38839G3();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.record_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        MediaPlayer mediaPlayer = this.f30466g0;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.f30466g0.stop();
                this.f30466g0.release();
            }
            this.f30466g0 = null;
        }
        Handler handler = this.f30440O0;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f30440O0 = null;
        }
        Handler handler2 = this.f30482w0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages((Object) null);
            this.f30482w0 = null;
        }
        if (this.f30425H != null) {
            this.f30425H = null;
        }
        if (this.f30413B != null) {
            this.f30413B = null;
        }
        if (this.f30415C != null) {
            this.f30415C = null;
        }
        if (this.f30417D != null) {
            this.f30417D = null;
        }
        if (this.f30427I != null) {
            this.f30427I = null;
        }
        if (this.f30429J != null) {
            this.f30429J = null;
        }
        C8321j.m45995a(this.f30433L);
        C8321j.m45995a(this.f30435M);
        C8321j.m45995a(this.f30437N);
        C8321j.m45995a(this.f30439O);
        C8321j.m45995a(this.f30441P);
        if (this.f30474o0 != null) {
            this.f30474o0 = null;
        }
        C8321j.m45995a(this.f30432K0);
        if (this.f30434L0 != null) {
            this.f30434L0 = null;
        }
        C6825d0 d0Var = this.f30436M0;
        if (d0Var != null) {
            unregisterReceiver(d0Var);
            this.f30436M0 = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        } else if (menuItem.getItemId() == R.id.save) {
            m38853N3();
        } else if (menuItem.getItemId() == R.id.reset) {
            mo26526P3();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT >= 11) {
            invalidateOptionsMenu();
        }
        C8340q.m46288b(this, new C6821b0());
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f30420E0 = true;
    }

    /* renamed from: p */
    public void mo26538p() {
    }

    /* renamed from: p3 */
    public double mo26539p3(Double d) {
        try {
            return Double.parseDouble(new DecimalFormat("0.0 ").format(d));
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(d);
            return Double.valueOf(valueOf.substring(0, valueOf.indexOf(".") + 2)).doubleValue();
        }
    }

    /* renamed from: q */
    public void mo26540q(float f, float f2) {
        if (this.f30426H0 != 0) {
            this.f30426H0 = 0;
        }
        this.f30460a0 = m38882c4((int) (((float) this.f30470k0) + (this.f30469j0 - f)));
        this.f30418D0 = false;
        m38888e4(false);
    }

    /* renamed from: s */
    public void mo26541s(float f) {
        this.f30424G0 = f;
        this.f30468i0 = false;
        this.f30461b0 = this.f30460a0;
        if (Math.abs(f - this.f30422F0) >= 20.0f) {
            return;
        }
        if (this.f30465f0) {
            int j = this.f30425H.mo27930j((int) (this.f30469j0 + ((float) this.f30460a0)));
            if (j < this.f30462c0 || j >= this.f30464e0) {
                m38835E3();
            } else {
                this.f30466g0.seekTo(j - this.f30463d0);
            }
        } else {
            m38851M3((int) (this.f30469j0 + ((float) this.f30460a0)));
        }
    }

    public void secEnd(View view) {
        m38910q3(false);
    }

    public void secStart(View view) {
        m38912r3(false);
    }

    public void setEnd(View view) {
        m38860R3(false);
    }

    public void setStart(View view) {
        m38860R3(true);
    }

    /* renamed from: t */
    public void mo26546t() {
        this.f30443Q = false;
        this.f30418D0 = false;
        m38888e4(true);
    }

    /* renamed from: v1 */
    public void mo26547v1(MarkerView markerView, float f) {
        this.f30425H.setLineStart(markerView == this.f30427I);
        this.f30468i0 = true;
        this.f30469j0 = f;
        this.f30471l0 = this.f30455W;
        this.f30472m0 = this.f30457X;
    }
}
