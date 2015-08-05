package net.wasdev.fasttransfer;

public interface TorrentControllerMBean {
	static final java.lang.String OBJECT_NAME = "com.zheng:feature=TorrentControllerFeature,type=TorrentController,name=TorrentController";

	public int transferTorrent(String srcName, String destDir, String hosts,
			String username, String password, String truststorePass,
			String host, String port, String contrTorrDir);

	public void cleanTorrentDir(String contrTorrDir);

}