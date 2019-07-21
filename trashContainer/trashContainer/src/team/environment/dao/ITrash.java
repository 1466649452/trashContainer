package team.environment.dao;

import java.util.ArrayList;

import team.environment.trash.po.TrashInfo;

public interface ITrash {
	public ArrayList<TrashInfo> querytrash(String trashname);
}
