import cv2
import time
import random

cap = cv2.VideoCapture(0)

messages = [
    'You look smart 😎',
    'Future Engineer 👨‍💻',
    'Python + OpenCV 🔥',
    'Smile Please 😁',
    'AI in progress 🤖'
    'Hello pankaj'
    'Wait '
]

mode = 0
prev_time = 0

while True:
    ret, frame = cap.read()
    if not ret:
        break

    # Mirror effect
    frame = cv2.flip(frame, 1)

    # Cartoon effect
    if mode == 1:
        gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
        blur = cv2.medianBlur(gray, 7)
        edges = cv2.adaptiveThreshold(
            blur, 255,
            cv2.ADAPTIVE_THRESH_MEAN_C,
            cv2.THRESH_BINARY,
            9, 2
        )
        color = cv2.bilateralFilter(frame, 9, 300, 300)
        frame = cv2.bitwise_and(color, color, mask=edges)

    # Funny text
    cv2.putText(
        frame,
        random.choice(messages),
        (20, 40),
        cv2.FONT_HERSHEY_SIMPLEX,
        1,
        (0, 255, 255),
        2
    )

    # FPS counter
    current_time = time.time()
    fps = int(1 / (current_time - prev_time)) if prev_time != 0 else 0
    prev_time = current_time

    cv2.putText(
        frame,
        f'FPS: {fps}',
        (20, 80),
        cv2.FONT_HERSHEY_SIMPLEX,
        0.8,
        (0, 255, 0),
        2
    )

    cv2.imshow('Funny OpenCV Camera', frame)

    key = cv2.waitKey(1) & 0xFF

    if key == ord('q'):
        break
    elif key == ord('c'):
        mode = 1   # cartoon mode
    elif key == ord('n'):
        mode = 0   # normal mode

cap.release()
cv2.destroyAllWindows()
