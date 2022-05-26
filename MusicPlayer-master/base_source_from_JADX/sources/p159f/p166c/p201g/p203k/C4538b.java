package p159f.p166c.p201g.p203k;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import p159f.p166c.p201g.C4507b;
import p159f.p166c.p201g.C4510e;
import p159f.p166c.p201g.C4511f;
import p159f.p166c.p201g.C4512g;
import p159f.p166c.p201g.C4513h;
import p159f.p166c.p201g.p208p.C4565a;
import p159f.p166c.p201g.p208p.C4568c;
import p159f.p166c.p201g.p208p.C4574h;

/* renamed from: f.c.g.k.b */
/* compiled from: VolumeWindowView */
public class C4538b extends LinearLayout {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Context f13173g;

    /* renamed from: h */
    private ViewGroup f13174h;

    /* renamed from: i */
    private SeekBar f13175i;

    /* renamed from: j */
    private SeekBar f13176j;

    /* renamed from: k */
    private ImageView f13177k;

    /* renamed from: l */
    private ImageView f13178l;

    /* renamed from: m */
    private TextView f13179m;

    /* renamed from: n */
    private TextView f13180n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public TextView f13181o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public TextView f13182p;

    /* renamed from: q */
    private ViewGroup f13183q;

    /* renamed from: r */
    private CheckBox f13184r;

    /* renamed from: s */
    private View f13185s;

    /* renamed from: t */
    private View f13186t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public AudioManager f13187u;

    /* renamed from: v */
    private int f13188v;

    /* renamed from: w */
    private int f13189w;

    /* renamed from: x */
    private int f13190x;

    /* renamed from: y */
    private int f13191y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C4544f f13192z;

    /* renamed from: f.c.g.k.b$a */
    /* compiled from: VolumeWindowView */
    class C4539a implements View.OnClickListener {
        C4539a() {
        }

        public void onClick(View view) {
            if (C4565a.m19902a().f13262e) {
                C4507b.m19755k(false);
                C4565a.m19902a().mo15296g(C4538b.this.f13173g, false);
                C4538b.this.setBoostEnable(false);
            } else {
                boolean k = C4507b.m19755k(true);
                C4538b.this.setBoostEnable(k);
                if (k) {
                    C4565a.m19902a().mo15296g(C4538b.this.f13173g, true);
                } else {
                    Toast.makeText(C4538b.this.f13173g, C4513h.unsupported, 0).show();
                }
            }
            if (C4538b.this.f13192z != null) {
                C4538b.this.f13192z.mo15231a();
            }
        }
    }

    /* renamed from: f.c.g.k.b$b */
    /* compiled from: VolumeWindowView */
    class C4540b implements SeekBar.OnSeekBarChangeListener {
        C4540b() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C4538b.this.setVolumeEnable(i > 0);
            C4538b.this.f13181o.setText(String.valueOf(i));
            if (C4538b.this.f13187u == null) {
                C4538b bVar = C4538b.this;
                AudioManager unused = bVar.f13187u = (AudioManager) bVar.f13173g.getSystemService("audio");
            }
            C4538b.this.f13187u.setStreamVolume(3, i, 0);
            if (C4538b.this.f13192z != null) {
                C4538b.this.f13192z.mo15231a();
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: f.c.g.k.b$c */
    /* compiled from: VolumeWindowView */
    class C4541c implements SeekBar.OnSeekBarChangeListener {
        C4541c() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            TextView h = C4538b.this.f13182p;
            h.setText(i + "%");
            C4507b.m19751g(i);
            if (C4538b.this.f13192z != null) {
                C4538b.this.f13192z.mo15231a();
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C4568c.m19957p(C4538b.this.f13173g, seekBar.getProgress());
        }
    }

    /* renamed from: f.c.g.k.b$d */
    /* compiled from: VolumeWindowView */
    class C4542d implements View.OnTouchListener {
        C4542d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || C4538b.this.f13192z == null) {
                return true;
            }
            C4538b.this.f13192z.onDismiss();
            return true;
        }
    }

    /* renamed from: f.c.g.k.b$e */
    /* compiled from: VolumeWindowView */
    class C4543e implements View.OnTouchListener {
        C4543e() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || C4538b.this.f13192z == null) {
                return true;
            }
            C4538b.this.f13192z.onDismiss();
            return true;
        }
    }

    /* renamed from: f.c.g.k.b$f */
    /* compiled from: VolumeWindowView */
    public interface C4544f {
        /* renamed from: a */
        void mo15231a();

        void onDismiss();
    }

    public C4538b(Context context) {
        super(context);
        m19823l(context);
    }

    /* renamed from: i */
    private void m19820i() {
        this.f13188v = C4565a.m19902a().f13265h;
        this.f13189w = C4565a.m19902a().f13266i;
        this.f13190x = C4565a.m19902a().f13267j;
        this.f13191y = C4565a.m19902a().f13268k;
    }

    /* renamed from: j */
    private void m19821j() {
        this.f13174h.setBackgroundColor(this.f13188v);
        this.f13179m.setTextColor(this.f13189w);
        this.f13181o.setTextColor(this.f13189w);
        this.f13180n.setTextColor(this.f13189w);
        this.f13182p.setTextColor(this.f13189w);
        this.f13178l.setColorFilter(this.f13189w);
        this.f13177k.setColorFilter(this.f13189w);
        C4574h.m19981b(this.f13184r, this.f13189w, this.f13190x);
        AudioManager audioManager = (AudioManager) this.f13173g.getSystemService("audio");
        this.f13187u = audioManager;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = this.f13187u.getStreamMaxVolume(3);
        this.f13175i.setProgress(streamVolume);
        this.f13175i.setMax(streamMaxVolume);
        setVolumeEnable(streamVolume > 0);
        this.f13181o.setText(String.valueOf(streamVolume));
        int e = C4568c.m19946e(this.f13173g);
        if (e > 100) {
            C4568c.m19957p(this.f13173g, 100);
            e = 100;
        }
        this.f13176j.setProgress(e);
        this.f13176j.setMax(100);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f13183q.setVisibility(0);
            if (C4565a.m19902a().f13262e) {
                setBoostEnable(C4507b.m19748d());
            } else {
                setBoostEnable(false);
            }
        } else {
            this.f13183q.setVisibility(8);
        }
        TextView textView = this.f13182p;
        textView.setText(e + "%");
    }

    /* renamed from: k */
    private void m19822k() {
        this.f13184r.setOnClickListener(new C4539a());
        this.f13175i.setOnSeekBarChangeListener(new C4540b());
        this.f13176j.setOnSeekBarChangeListener(new C4541c());
        this.f13185s.setOnTouchListener(new C4542d());
        this.f13186t.setOnTouchListener(new C4543e());
    }

    /* renamed from: l */
    private void m19823l(Context context) {
        this.f13173g = context;
        LayoutInflater.from(context).inflate(C4512g.volume_window_view, this);
        this.f13174h = (ViewGroup) findViewById(C4511f.window_layout);
        this.f13175i = (SeekBar) findViewById(C4511f.volume_seek_bar);
        this.f13176j = (SeekBar) findViewById(C4511f.boost_seek_bar);
        this.f13177k = (ImageView) findViewById(C4511f.iv_volume);
        this.f13178l = (ImageView) findViewById(C4511f.iv_boost);
        this.f13179m = (TextView) findViewById(C4511f.tv_volume);
        this.f13180n = (TextView) findViewById(C4511f.tv_boost);
        this.f13181o = (TextView) findViewById(C4511f.tv_volume_num);
        this.f13182p = (TextView) findViewById(C4511f.tv_boost_num);
        this.f13183q = (ViewGroup) findViewById(C4511f.boost_layout);
        this.f13184r = (CheckBox) findViewById(C4511f.cb_boost);
        this.f13185s = findViewById(C4511f.top_view);
        this.f13186t = findViewById(C4511f.bottom_view);
        m19820i();
        m19821j();
        m19822k();
    }

    /* access modifiers changed from: private */
    public void setBoostEnable(boolean z) {
        if (z) {
            this.f13184r.setChecked(true);
            this.f13176j.setEnabled(true);
            C4574h.m19982c(this.f13176j, this.f13190x);
            this.f13178l.setImageResource(C4510e.home_more_boost);
            return;
        }
        this.f13184r.setChecked(false);
        this.f13176j.setEnabled(false);
        C4574h.m19982c(this.f13176j, this.f13191y);
        this.f13178l.setImageResource(C4510e.home_more_boost_none);
    }

    /* access modifiers changed from: private */
    public void setVolumeEnable(boolean z) {
        if (z) {
            C4574h.m19982c(this.f13175i, this.f13190x);
            this.f13177k.setImageResource(C4510e.home_more_volume);
            return;
        }
        C4574h.m19982c(this.f13175i, this.f13191y);
        this.f13177k.setImageResource(C4510e.home_more_volume_none);
    }

    /* renamed from: m */
    public void mo15236m(boolean z) {
        Context context = this.f13173g;
        if (context != null && this.f13175i != null && this.f13181o != null) {
            if (this.f13187u == null) {
                this.f13187u = (AudioManager) context.getSystemService("audio");
            }
            int streamVolume = this.f13187u.getStreamVolume(3);
            int streamMaxVolume = this.f13187u.getStreamMaxVolume(3);
            if (z) {
                int i = streamVolume + 1;
                if (i <= streamMaxVolume) {
                    streamMaxVolume = i;
                }
            } else {
                streamMaxVolume = streamVolume - 1;
                if (streamMaxVolume <= 0) {
                    streamMaxVolume = 0;
                }
            }
            this.f13175i.setProgress(streamMaxVolume);
            this.f13181o.setText(String.valueOf(streamMaxVolume));
        }
    }

    public void setOnBoostVolumeChangeListener(C4544f fVar) {
        this.f13192z = fVar;
    }
}
