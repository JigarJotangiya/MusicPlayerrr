package coocent.musiclibrary.music.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import coocent.musiclibrary.music.p281b.C7323b;
import p342g.p359b.C8350d;
import p342g.p359b.C8351e;

public class LyricSetView extends RelativeLayout {

    /* renamed from: g */
    private SeekBar f32572g;

    /* renamed from: h */
    private ImageView[] f32573h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C7323b f32574i;

    /* renamed from: j */
    private final int[] f32575j = {-16711912, -16750849, -8509185, -65422, -16384, -16711684};

    /* renamed from: k */
    private RelativeLayout[] f32576k;

    /* renamed from: l */
    private TextView f32577l;

    /* renamed from: m */
    private C7410b f32578m;

    /* renamed from: n */
    private ImageView f32579n;

    /* renamed from: o */
    private View f32580o;

    /* renamed from: coocent.musiclibrary.music.view.LyricSetView$a */
    class C7409a implements SeekBar.OnSeekBarChangeListener {
        C7409a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (LyricSetView.this.f32574i != null) {
                LyricSetView.this.f32574i.mo28059a(i + 11);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: coocent.musiclibrary.music.view.LyricSetView$b */
    public interface C7410b {
        void cancel();
    }

    public LyricSetView(Context context) {
        super(context);
        m41771b(context);
    }

    /* renamed from: b */
    private void m41771b(Context context) {
        View.inflate(context, C8351e.bottom_lyric_text_set_layout, this);
        this.f32572g = (SeekBar) findViewById(C8350d.seekbar);
        this.f32579n = (ImageView) findViewById(C8350d.f34794bg);
        this.f32580o = findViewById(C8350d.bg_cover);
        this.f32577l = (TextView) findViewById(C8350d.cancel);
        this.f32573h = new ImageView[]{(ImageView) findViewById(C8350d.iv_1_1), (ImageView) findViewById(C8350d.iv_2_2), (ImageView) findViewById(C8350d.iv_3_3), (ImageView) findViewById(C8350d.iv_4_4), (ImageView) findViewById(C8350d.iv_5_5), (ImageView) findViewById(C8350d.iv_6_6)};
        this.f32576k = new RelativeLayout[]{(RelativeLayout) findViewById(C8350d.rl_green), (RelativeLayout) findViewById(C8350d.rl_blue), (RelativeLayout) findViewById(C8350d.rl_popup), (RelativeLayout) findViewById(C8350d.rl_pink), (RelativeLayout) findViewById(C8350d.rl_yellow), (RelativeLayout) findViewById(C8350d.rl_green_blue)};
        m41774g();
        m41775h();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void mo28255d(int i, View view) {
        setImageVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void mo28256f(View view) {
        C7410b bVar = this.f32578m;
        if (bVar != null) {
            bVar.cancel();
        }
    }

    /* renamed from: g */
    private void m41774g() {
        setImageVisibility(0);
    }

    /* renamed from: h */
    private void m41775h() {
        this.f32572g.setOnSeekBarChangeListener(new C7409a());
        int i = 0;
        while (true) {
            RelativeLayout[] relativeLayoutArr = this.f32576k;
            if (i < relativeLayoutArr.length) {
                relativeLayoutArr[i].setOnClickListener(new C7414b(this, i));
                i++;
            } else {
                this.f32577l.setOnClickListener(new C7413a(this));
                return;
            }
        }
    }

    private void setImageVisibility(int i) {
        int i2 = 0;
        while (true) {
            ImageView[] imageViewArr = this.f32573h;
            if (i2 < imageViewArr.length) {
                if (i == i2) {
                    imageViewArr[i2].setVisibility(0);
                    C7323b bVar = this.f32574i;
                    if (bVar != null) {
                        bVar.mo28060b(this.f32575j[i2]);
                    }
                } else {
                    imageViewArr[i2].setVisibility(4);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public ImageView getLyricBgView() {
        View view = this.f32580o;
        if (view != null) {
            view.setBackgroundColor(-16777216);
            this.f32580o.setVisibility(0);
        }
        ImageView imageView = this.f32579n;
        if (imageView != null) {
            return imageView;
        }
        return null;
    }

    public void setCancelListener(C7410b bVar) {
        this.f32578m = bVar;
    }

    public void setLyricSetCallBack(C7323b bVar) {
        this.f32574i = bVar;
    }

    public void setLyricSetViewBg(Bitmap bitmap) {
        ImageView imageView = this.f32579n;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
            this.f32579n.setAlpha(0.7f);
        }
        View view = this.f32580o;
        if (view != null) {
            view.setBackgroundColor(-16777216);
            this.f32580o.setVisibility(0);
        }
    }

    public void setTextColor(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f32575j;
            if (i2 >= iArr.length) {
                return;
            }
            if (iArr[i2] == i) {
                setImageVisibility(i2);
                return;
            }
            i2++;
        }
    }

    public void setTextSize(int i) {
        int i2 = i - 11;
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 > this.f32572g.getMax()) {
            i2 = this.f32572g.getMax();
        }
        this.f32572g.setProgress(i2);
    }

    public LyricSetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m41771b(context);
    }

    public LyricSetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m41771b(context);
    }
}
