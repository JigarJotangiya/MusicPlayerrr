package coocent.music.player.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;

public class ColorPickerSeekBar extends AppCompatSeekBar implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: h */
    private C7129a f31481h;

    /* renamed from: coocent.music.player.widget.ColorPickerSeekBar$a */
    public interface C7129a {
        /* renamed from: a */
        void mo27402a(SeekBar seekBar, int i, boolean z);

        void onStartTrackingTouch(SeekBar seekBar);

        void onStopTrackingTouch(SeekBar seekBar);
    }

    public ColorPickerSeekBar(Context context) {
        super(context);
        setOnSeekBarChangeListener(this);
    }

    /* renamed from: a */
    public void mo27396a() {
        setMax(1791);
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2;
        C7129a aVar = this.f31481h;
        if (aVar != null) {
            int i3 = 0;
            if (i >= 256) {
                if (i < 512) {
                    int i4 = i % 256;
                    i2 = i4;
                    r7 = 256 - i4;
                } else {
                    if (i < 768) {
                        r7 = i % 256;
                    } else if (i < 1024) {
                        i3 = i % 256;
                        r7 = 256 - i3;
                        i2 = r7;
                    } else if (i < 1280) {
                        i %= 256;
                        i3 = 255;
                    } else if (i < 1536) {
                        int i5 = i % 256;
                        r7 = 256 - i5;
                        i2 = i5;
                        i3 = 255;
                    } else if (i < 1792) {
                        r7 = i % 256;
                        i3 = 255;
                    } else {
                        i = 0;
                    }
                    i2 = 255;
                }
                aVar.mo27402a(seekBar, Color.argb(255, i3, i2, r7), z);
            }
            i2 = 0;
            aVar.mo27402a(seekBar, Color.argb(255, i3, i2, r7), z);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo27396a();
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        C7129a aVar = this.f31481h;
        if (aVar != null) {
            aVar.onStartTrackingTouch(seekBar);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C7129a aVar = this.f31481h;
        if (aVar != null) {
            aVar.onStopTrackingTouch(seekBar);
        }
    }

    public void setOnColorSeekBarChangeListener(C7129a aVar) {
        this.f31481h = aVar;
    }

    public ColorPickerSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnSeekBarChangeListener(this);
    }

    public ColorPickerSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOnSeekBarChangeListener(this);
    }
}
