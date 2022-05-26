package coocent.music.player.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import coocent.music.player.mode.C7058c;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p391j.p392a.p393a.C8613f;
import p443m.p444a.p447e.p448a.C9332d;

public class SoundEffectMoreAdapter extends BaseQuickAdapter<C7058c, BaseViewHolder> {
    public SoundEffectMoreAdapter(int i, List<C7058c> list) {
        super(i, list);
    }

    /* renamed from: d */
    private void m39974d(BaseViewHolder baseViewHolder) {
        if (baseViewHolder.getAdapterPosition() == 0) {
            baseViewHolder.setImageDrawable(R.id.option_image, C9332d.m49407d(this.mContext, R.drawable.ic_edit));
        } else if (baseViewHolder.getAdapterPosition() == 1) {
            baseViewHolder.setImageDrawable(R.id.option_image, C9332d.m49407d(this.mContext, R.drawable.ic_rename));
        } else if (baseViewHolder.getAdapterPosition() == 2) {
            baseViewHolder.setImageDrawable(R.id.option_image, C9332d.m49407d(this.mContext, C8613f.ic_delete));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void convert(BaseViewHolder baseViewHolder, C7058c cVar) {
        baseViewHolder.setText((int) R.id.option_text, (CharSequence) cVar.mo27084a());
        m39974d(baseViewHolder);
    }
}
