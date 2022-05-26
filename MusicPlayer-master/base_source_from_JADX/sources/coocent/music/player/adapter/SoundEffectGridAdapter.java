package coocent.music.player.adapter;

import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import coocent.music.player.mode.SoundEffect;
import coocent.music.player.widget.SquareRoundImageView;
import media.musicplayer.audioplayer.videoplayer.R;
import p443m.p444a.p447e.p448a.C9332d;

public class SoundEffectGridAdapter extends BaseQuickAdapter<SoundEffect, BaseViewHolder> {
    /* renamed from: d */
    private void m39968d(BaseViewHolder baseViewHolder, SoundEffect soundEffect, boolean z) {
        ImageView imageView = (ImageView) baseViewHolder.getView(R.id.sound_image);
        SquareRoundImageView squareRoundImageView = (SquareRoundImageView) baseViewHolder.getView(R.id.item_sound_effect_nomal_shape);
        TextView textView = (TextView) baseViewHolder.getView(R.id.sound_effect_text);
        if (!(soundEffect.mo26991C() == 0 || soundEffect.mo26991C() == 1 || soundEffect.mo26991C() == 2 || soundEffect.mo26991C() == 3 || soundEffect.mo26991C() == 4 || soundEffect.mo26991C() == 5)) {
            soundEffect.mo26991C();
        }
        soundEffect.mo26991C();
        textView.setTextColor(C9332d.m49405b(this.mContext, z ? R.color.select_text_color : R.color.default_text_color));
    }

    /* renamed from: e */
    private void m39969e(BaseViewHolder baseViewHolder, boolean z, boolean z2) {
        if (z && z2) {
            baseViewHolder.setGone(R.id.sound_image, false);
        } else if ((z && !z2) || !z) {
            baseViewHolder.setGone(R.id.sound_image, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void convert(BaseViewHolder baseViewHolder, SoundEffect soundEffect) {
        if (soundEffect.mo26992D() == null || soundEffect.mo26992D().trim().isEmpty()) {
            baseViewHolder.setGone(R.id.sound_effect_text, false);
        } else {
            baseViewHolder.setText((int) R.id.sound_effect_text, (CharSequence) soundEffect.mo26992D());
            baseViewHolder.setGone(R.id.sound_effect_text, true);
        }
        boolean M = soundEffect.mo26998M();
        m39969e(baseViewHolder, M, soundEffect.mo26999N());
        m39968d(baseViewHolder, soundEffect, M);
    }
}
