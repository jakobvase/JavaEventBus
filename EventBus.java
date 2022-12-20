public interface EventBus {
	public void registerListener();
	public void removeListener();
	public void sendEvent();
}