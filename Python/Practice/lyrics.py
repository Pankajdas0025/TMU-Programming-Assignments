import time
import sys

def print_Lyrics():
    lyrics = [
        "Is this the real life? Is this just fantasy?",
        "Caught in a landslide, no escape from reality.",
        "Open your eyes, look up to the skies and see,",
        "I'm just a",
        "poor boy",
        "I need no sympathy,"]
    delays = [1.0, 0.1,1.12, 0.9, 0.8, 0.5]
    for line, delay in zip(lyrics, delays):
        for char in line:
            sys.stdout.write(char)
            sys.stdout.flush()
            time.sleep(0.05)  # Simulate typing effect
        print(line)
        time.sleep(delay)
        time.sleep(0.2)  # Pause between lines
if __name__ == "__main__":    print_Lyrics()

