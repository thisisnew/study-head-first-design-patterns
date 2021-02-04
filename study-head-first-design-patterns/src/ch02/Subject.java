package ch02;

public interface Subject {
	public void regsterObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
