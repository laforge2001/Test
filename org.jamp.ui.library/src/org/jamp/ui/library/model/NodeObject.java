package org.jamp.ui.library.model;

import java.util.ArrayList;

import org.jamp.ui.library.views.IImageKeys;

public class NodeObject {

	private String _name;
	private Object _data;
	private ArrayList<NodeObject> _children;
	private NodeObject _parent;
	private String _imageDescriptor;

	public NodeObject(String name, Object data) {
		_name = name;
		_data = data;
		_parent = null;
		_children = null;
		_imageDescriptor = IImageKeys.SAMPLE_ICON;
	}

	public String getName() {
		return _name;
	}

	public Object getData() {
		return _data;
	}

	public ArrayList<NodeObject> getChildren() {
		if (!hasChildren()) {
			return new ArrayList<NodeObject>();
		}
		return _children;
	}

	public Boolean hasChildren() {
		return (_children != null);
	}

	public void addChild(NodeObject child) {
		child.setParent(this);
		if (!hasChildren()) {
			_children = new ArrayList<NodeObject>();
		}
		_children.add(child);
	}

	public Boolean removeChild(NodeObject child) {
		if (child.isLeaf()) {
			child.setParent(null);
			return _children.remove(child);
		} else {
			for (NodeObject l : child.getChildren()) {
				return child.removeChild(l);
			}
		}
		return false;
	}

	public Boolean isLeaf() {
		return _children.size() == 0;
	}

	public void setParent(NodeObject parent) {
		_parent = parent;
	}

	public NodeObject getParent() {
		return _parent;
	}

	public String getIconLocation() {
		return _imageDescriptor;
	}

}
