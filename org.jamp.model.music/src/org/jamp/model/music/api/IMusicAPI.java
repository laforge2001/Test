package org.jamp.model.music.api;

import org.jamp.model.api.IMediaAPI;

public interface IMusicAPI extends IMediaAPI {

	public int getPosition();

	public String getSongTitle();

	public String getAlbum();

	public String getArtist();

	public Integer getYear();

	public Integer getSongLength();

}
