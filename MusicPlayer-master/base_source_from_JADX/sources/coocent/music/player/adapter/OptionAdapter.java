package coocent.music.player.adapter;

import android.widget.ImageView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import coocent.music.player.mode.C7058c;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8321j;

public class OptionAdapter extends BaseQuickAdapter<C7058c, BaseViewHolder> {
    public OptionAdapter(int i, List<C7058c> list) {
        super(i, list);
    }

    /* renamed from: d */
    private void m39958d(BaseViewHolder baseViewHolder) {
        baseViewHolder.setBackgroundRes(R.id.option_image, R.drawable.popup_item_shape_black);
        baseViewHolder.setTextColor(R.id.option_text, -1);
        if (baseViewHolder.getAdapterPosition() == 0) {
            C8321j.m46000f(R.drawable.ic_library_more_ringtone_white, (ImageView) baseViewHolder.getView(R.id.option_image));
        } else if (baseViewHolder.getAdapterPosition() == 1) {
            C8321j.m46000f(R.drawable.ic_library_more_timing_white, (ImageView) baseViewHolder.getView(R.id.option_image));
        } else if (baseViewHolder.getAdapterPosition() == 2) {
            C8321j.m46000f(R.drawable.ic_library_more_song_cover_2, (ImageView) baseViewHolder.getView(R.id.option_image));
        } else if (baseViewHolder.getAdapterPosition() == 3) {
            C8321j.m46000f(R.drawable.ic_library_more_add_delete_white, (ImageView) baseViewHolder.getView(R.id.option_image));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void convert(BaseViewHolder baseViewHolder, C7058c cVar) {
        baseViewHolder.setText((int) R.id.option_text, (CharSequence) cVar.mo27084a());
        m39958d(baseViewHolder);
    }
}
