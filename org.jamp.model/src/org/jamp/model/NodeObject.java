package org.jamp.model;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class NodeObject {

	private final String _name;
	private final Object _data;
	private ArrayList<NodeObject> _children;
	private NodeObject _parent;
	private ImageDescriptor _imageDescr;

	public NodeObject(String name, Object data) {
		_name = name;
		_data = data;
		_parent = null;
		_children = null;
		_imageDescr = AbstractUIPlugin.imageDescriptorFromPlugin(
				"org.jamp.model", "icons/playlist_22x22.png");
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

	public ImageDescriptor getImageDescriptor() {
		return _imageDescr;
	}

	public void setImageDescriptor(ImageDescriptor desc) {
		_imageDescr = desc;
	}

}
