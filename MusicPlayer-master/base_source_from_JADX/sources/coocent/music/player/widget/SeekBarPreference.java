package coocent.music.player.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import coocent.music.player.base.BaseApplication;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8342r;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

public class SeekBarPreference extends DialogPreference implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: g */
    private int f31725g;

    /* renamed from: h */
    private TextView f31726h;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    private String m40798c(int i) {
        if ("shake_threshold".equals(getKey())) {
            return String.valueOf(((float) i) / 10.0f);
        }
        return String.format("%d%% (%+.1fdB)", new Object[]{Integer.valueOf(i), Double.valueOf(Math.log10(Math.pow(((double) i) / 100.0d, 3.0d)) * 20.0d)});
    }

    public CharSequence getSummary() {
        return m40798c(this.f31725g);
    }

    /* access modifiers changed from: protected */
    public void onBindView(View view) {
        super.onBindView(view);
        ((TextView) view.findViewById(16908310)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        ((TextView) view.findViewById(16908304)).setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
    }

    /* access modifiers changed from: protected */
    public View onCreateDialogView() {
        View onCreateDialogView = super.onCreateDialogView();
        TextView textView = (TextView) onCreateDialogView.findViewById(R.id.value);
        this.f31726h = textView;
        textView.setText(m40798c(this.f31725g));
        SeekBar seekBar = (SeekBar) onCreateDialogView.findViewById(R.id.seek_bar);
        seekBar.setMax(150);
        seekBar.setProgress(this.f31725g);
        seekBar.setOnSeekBarChangeListener(this);
        return onCreateDialogView;
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        notifyChanged();
    }

    /* access modifiers changed from: protected */
    public Object onGetDefaultValue(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 100));
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.f31725g = i;
            this.f31726h.setText(m40798c(i));
            persistInt(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onSetInitialValue(boolean z, Object obj) {
        int i;
        if (z) {
            i = getPersistedInt(this.f31725g);
        } else {
            i = ((Integer) obj).intValue();
        }
        this.f31725g = i;
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C8287e.m45795M0((float) seekBar.getProgress());
        C8342r.m46289b().mo30289d(BaseApplication.f31155s);
        getContext().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.share_change_track").setPackage(C8345u.m46327h().getPackageName()));
    }
}
