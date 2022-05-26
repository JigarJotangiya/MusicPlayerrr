package com.coocent.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class CarModeView extends FrameLayout implements View.OnClickListener {

    /* renamed from: g */
    private ImageView f7499g;

    /* renamed from: h */
    private ImageView f7500h;

    /* renamed from: i */
    private ImageView f7501i;

    /* renamed from: j */
    private ImageView f7502j;

    /* renamed from: k */
    private ImageView f7503k;

    /* renamed from: l */
    private ImageView f7504l;

    /* renamed from: m */
    private ImageView f7505m;

    /* renamed from: n */
    private TextView f7506n;

    /* renamed from: o */
    private TextView f7507o;

    /* renamed from: p */
    private RoundProgressView f7508p;

    /* renamed from: q */
    private TextView f7509q;

    /* renamed from: r */
    private int f7510r;

    /* renamed from: s */
    private boolean f7511s;

    /* renamed from: t */
    private C2224a f7512t;

    /* renamed from: com.coocent.library.CarModeView$a */
    public interface C2224a {
        /* renamed from: D */
        void mo8821D();

        /* renamed from: F */
        void mo8822F();

        /* renamed from: M */
        void mo8823M();

        /* renamed from: N0 */
        void mo8824N0(int i);

        /* renamed from: P0 */
        void mo8825P0();

        /* renamed from: U0 */
        void mo8826U0();

        /* renamed from: c0 */
        void mo8827c0();
    }

    public CarModeView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m10354a(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(getContext()).inflate(C2229d.carmode_view, this);
        this.f7499g = (ImageView) inflate.findViewById(C2228c.iv_exit);
        this.f7500h = (ImageView) inflate.findViewById(C2228c.iv_favorite);
        this.f7501i = (ImageView) inflate.findViewById(C2228c.iv_play_mode);
        this.f7502j = (ImageView) inflate.findViewById(C2228c.iv_play_list);
        this.f7503k = (ImageView) inflate.findViewById(C2228c.iv_prev);
        this.f7504l = (ImageView) inflate.findViewById(C2228c.iv_play);
        this.f7505m = (ImageView) inflate.findViewById(C2228c.iv_next);
        this.f7506n = (TextView) inflate.findViewById(C2228c.tv_music);
        this.f7507o = (TextView) inflate.findViewById(C2228c.tv_artist);
        this.f7508p = (RoundProgressView) inflate.findViewById(C2228c.progress);
        this.f7509q = (TextView) inflate.findViewById(C2228c.car_mode_text);
        this.f7506n.setSelected(true);
        this.f7507o.setSelected(true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2230e.CarModeView);
            String string = obtainStyledAttributes.getString(C2230e.CarModeView_carModeText);
            boolean z = obtainStyledAttributes.getBoolean(C2230e.CarModeView_carIsFavoriteVisible, true);
            obtainStyledAttributes.recycle();
            if (!TextUtils.isEmpty(string)) {
                this.f7509q.setText(string);
            }
            this.f7500h.setVisibility(z ? 0 : 8);
        }
        m10355b();
    }

    /* renamed from: b */
    private void m10355b() {
        this.f7499g.setOnClickListener(this);
        this.f7501i.setOnClickListener(this);
        this.f7502j.setOnClickListener(this);
        this.f7500h.setOnClickListener(this);
        this.f7503k.setOnClickListener(this);
        this.f7504l.setOnClickListener(this);
        this.f7505m.setOnClickListener(this);
    }

    public static int getDefaultAlbumCover() {
        return C2227b.drivemode_album_cover_default;
    }

    /* renamed from: d */
    public void mo8811d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "unKnown";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "unKnown";
        }
        TextView textView = this.f7506n;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.f7507o;
        if (textView2 != null) {
            textView2.setText(str2);
        }
    }

    /* renamed from: f */
    public void mo8812f(int i, int i2) {
        RoundProgressView roundProgressView = this.f7508p;
        if (roundProgressView != null) {
            roundProgressView.mo8829d(i, i2, this.f7511s);
            this.f7511s = false;
        }
    }

    /* renamed from: n */
    public void mo8813n(int i, int i2) {
        View findViewById = findViewById(i);
        if (findViewById != null) {
            findViewById.setVisibility(i2);
        }
    }

    public void onClick(View view) {
        C2224a aVar;
        int id = view.getId();
        if (id == C2228c.iv_exit) {
            C2224a aVar2 = this.f7512t;
            if (aVar2 != null) {
                aVar2.mo8822F();
            }
        } else if (id == C2228c.iv_play_mode) {
            int i = this.f7510r + 1;
            this.f7510r = i;
            if (i > 3) {
                this.f7510r = 0;
            }
            setPlayMode(this.f7510r);
            C2224a aVar3 = this.f7512t;
            if (aVar3 != null) {
                aVar3.mo8824N0(this.f7510r);
            }
        } else if (id == C2228c.iv_play_list) {
            C2224a aVar4 = this.f7512t;
            if (aVar4 != null) {
                aVar4.mo8827c0();
            }
        } else if (id == C2228c.iv_favorite) {
            C2224a aVar5 = this.f7512t;
            if (aVar5 != null) {
                aVar5.mo8826U0();
            }
        } else if (id == C2228c.iv_prev) {
            C2224a aVar6 = this.f7512t;
            if (aVar6 != null) {
                aVar6.mo8823M();
            }
        } else if (id == C2228c.iv_play) {
            C2224a aVar7 = this.f7512t;
            if (aVar7 != null) {
                aVar7.mo8825P0();
            }
        } else if (id == C2228c.iv_next && (aVar = this.f7512t) != null) {
            aVar.mo8821D();
        }
    }

    public void setCarModeText(String str) {
        TextView textView = this.f7509q;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setFavorite(boolean z) {
        ImageView imageView = this.f7500h;
        if (imageView != null) {
            imageView.setImageResource(z ? C2227b.drivemode_ic_love_on : C2227b.drivemode_ic_love);
        }
    }

    public void setOnCarModeListener(C2224a aVar) {
        this.f7512t = aVar;
    }

    public void setPercentage(float f) {
        RoundProgressView roundProgressView = this.f7508p;
        if (roundProgressView != null) {
            roundProgressView.mo8828c(f, this.f7511s);
            this.f7511s = false;
        }
    }

    public void setPlayMode(int i) {
        this.f7510r = i;
        ImageView imageView = this.f7501i;
        if (imageView != null) {
            int i2 = C2227b.drivemode_ic_sequence;
            if (i != 0) {
                if (i == 1) {
                    i2 = C2227b.drivemode_ic_roop;
                } else if (i == 2) {
                    i2 = C2227b.drivemode_ic_roop_single;
                } else if (i == 3) {
                    i2 = C2227b.drivemode_ic_shuffle;
                }
            }
            imageView.setImageResource(i2);
        }
    }

    public void setPlaying(boolean z) {
        ImageView imageView = this.f7504l;
        if (imageView != null) {
            imageView.setImageResource(z ? C2227b.drivemode_ic_pause : C2227b.drivemode_ic_play);
        }
    }

    public CarModeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CarModeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7510r = 0;
        this.f7511s = true;
        m10354a(context, attributeSet);
    }
}
