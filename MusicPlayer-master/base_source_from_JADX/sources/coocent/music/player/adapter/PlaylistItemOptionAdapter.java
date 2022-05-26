package coocent.music.player.adapter;

import android.widget.ImageView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import coocent.music.player.mode.C7058c;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8343s;

public class PlaylistItemOptionAdapter extends BaseQuickAdapter<C7058c, BaseViewHolder> {
    public PlaylistItemOptionAdapter(int i, List<C7058c> list) {
        super(i, list);
    }

    /* renamed from: d */
    private void m39964d(BaseViewHolder baseViewHolder) {
        if (baseViewHolder.getAdapterPosition() == 0) {
            ((ImageView) baseViewHolder.getView(R.id.option_image)).setImageDrawable(C8343s.m46304l(R.drawable.ic_library_more_palynext2, R.color.default_text_color));
        } else if (baseViewHolder.getAdapterPosition() == 1) {
            ((ImageView) baseViewHolder.getView(R.id.option_image)).setImageDrawable(C8343s.m46304l(R.drawable.ic_library_more_add_rename, R.color.default_text_color));
        } else if (baseViewHolder.getAdapterPosition() == 2) {
            ((ImageView) baseViewHolder.getView(R.id.option_image)).setImageDrawable(C8343s.m46304l(R.drawable.ic_library_more_add_delete, R.color.default_text_color));
        }
        ((ImageView) baseViewHolder.getView(R.id.option_image)).setBackground(C8343s.m46298f(R.drawable.popup_item_shape));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void convert(BaseViewHolder baseViewHolder, C7058c cVar) {
        baseViewHolder.setText((int) R.id.option_text, (CharSequence) cVar.mo27084a());
        baseViewHolder.setTextColor(R.id.option_text, C8343s.m46295c(R.color.default_text_color));
        m39964d(baseViewHolder);
    }
}
