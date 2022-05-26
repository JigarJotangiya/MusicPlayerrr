package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

public abstract class SeekPlay extends ImageView {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f31727g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f31728h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f31729i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f31730j;

    /* renamed from: k */
    private View.OnTouchListener f31731k;

    /* renamed from: coocent.music.player.widget.SeekPlay$a */
    class C7167a implements View.OnTouchListener {

        /* renamed from: coocent.music.player.widget.SeekPlay$a$a */
        class C7168a extends Thread {
            C7168a() {
            }

            public void run() {
                super.run();
                do {
                } while (SeekPlay.this.f31727g);
            }
        }

        C7167a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                boolean unused = SeekPlay.this.f31727g = true;
                long unused2 = SeekPlay.this.f31728h = System.currentTimeMillis();
                new C7168a().start();
            } else if (motionEvent.getAction() == 1) {
                boolean unused3 = SeekPlay.this.f31727g = false;
                long unused4 = SeekPlay.this.f31729i = System.currentTimeMillis();
                if (SeekPlay.this.f31729i - SeekPlay.this.f31728h >= 500) {
                    boolean unused5 = SeekPlay.this.f31730j = true;
                } else {
                    boolean unused6 = SeekPlay.this.f31730j = false;
                }
            }
            return false;
        }
    }

    public SeekPlay(Context context) {
        super(context);
        this.f31727g = false;
        this.f31730j = false;
        this.f31731k = new C7167a();
    }

    public boolean getIsLongClick() {
        return this.f31730j;
    }

    public abstract int getProgress();

    public void setSeekbar(ProgressBar progressBar) {
    }

    public SeekPlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31727g = false;
        this.f31730j = false;
        C7167a aVar = new C7167a();
        this.f31731k = aVar;
        setOnTouchListener(aVar);
    }

    public SeekPlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31727g = false;
        this.f31730j = false;
        this.f31731k = new C7167a();
    }
}
