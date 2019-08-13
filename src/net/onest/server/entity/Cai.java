package net.onest.server.entity;

public class Cai {
	private int id;
	private String caiName;
	private String caiDesc;
	private String caiClass;
	private String caiRaw;
	private String caiStep;
	private String caiImageUrl;
	public Cai() {
		super();
	}

	public Cai(int id, String caiName, String caiDesc, String caiClass, String caiRaw, String caiStep,
			String caiImageUrl) {
		super();
		this.id = id;
		this.caiName = caiName;
		this.caiDesc = caiDesc;
		this.caiClass = caiClass;
		this.caiRaw = caiRaw;
		this.caiStep = caiStep;
		this.caiImageUrl = caiImageUrl;
	}

	public String getCaiDesc() {
		return caiDesc;
	}

	public void setCaiDesc(String caiDesc) {
		this.caiDesc = caiDesc;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCaiName() {
		return caiName;
	}
	public void setCaiName(String caiName) {
		this.caiName = caiName;
	}
	public String getCaiClass() {
		return caiClass;
	}
	public void setCaiClass(String caiClass) {
		this.caiClass = caiClass;
	}
	public String getCaiRaw() {
		return caiRaw;
	}
	public void setCaiRaw(String caiRaw) {
		this.caiRaw = caiRaw;
	}
	public String getCaiStep() {
		return caiStep;
	}
	public void setCaiStep(String caiStep) {
		this.caiStep = caiStep;
	}
	public String getCaiImageUrl() {
		return caiImageUrl;
	}
	public void setCaiImageUrl(String caiImageUrl) {
		this.caiImageUrl = caiImageUrl;
	}
	
}
