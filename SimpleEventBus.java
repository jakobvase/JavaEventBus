public class SimpleEventBus {
	private ArrayList<Listener> listeners;

	internal SimpleEventBus() {
		listeners = new ArrayList<Listener>();
	}

	public void registerListener(Listener listener){
		listeners.add(listener);
	}

	public void removeListener(Listener listener){
		listeners.remove(listener);
	}

	public void sendEvent(Event e){
		for(Listener l : listeners) {
			l.sendEvent(e);
		}
	}
}