### Aufgabe 1 : Thread Zustände 
##### Benennen Sie die Thread Zustände
+ New: Thead wurde erstellt, aber noch nicht gestartet.
+ Runnable: Thread ist lauffähig.
    + Ready: Thread könnte laufen wurde aber noch keinem kern zugeteilt.
    + Running: Thread befindet sich in der Ausführung.
+ Timed Waiting: Thread wartet für eine bestimmte Zeit und arbeitet danach weiter .
+ Waiting: Thread wird nicht ausgeführt, da er für eine unbestimmte Zeit suspendiert wurde.
+ Blocked: Thread wartet auf Ressourcen.
+ Terminated: Thread ist fertig.
##### Benennen Sie die Java-Methoden mit denen man einen Thread in dein jeweiligen Zustanden Versetzt
+ start() : startet einen Thread ⇒ Thread geht in den Runnable Zustand.
+ sleep(sleeptime) : Thread in den Timed Waiting Zustand und wartet eine bestimmte Zeit.
+ wait(timeout) : Thread wartet in dem Timed Waiting Zustand für ne bestimmt Zeit, aber kann auch mit notify() und notiyfyAll() früher geweckt werden.
+ join(timeout) : Thread wartet in dem Timed Waiting Zustand für ne bestimmt Zeit.
+ wait() : wartet im Waiting Zustand bis er mit notify() oder notifyAll() geweckt wird.
+ join() : wartet im Waiting Zustand bis ein anderer Thread stirbt.
+ yield() : Thread versetzt sich selbst in den Ready zustand, damit andere Thread arbeiten können.
+ notify(), notifyAll() : kann nur in Locks verwendet werden um anderen Threads die, die Ressourcen benutzen wollen dran zu lassen.
+ interrupt() : weckt einen schlafenden speziellen Thread.
##### Wenn keine Methode existiert: von wem wird der Thread in den jeweiligen Zustand versetzt?
Die Threads werden vom Scheduler dan in die verschiedenen Zustände versetzt.